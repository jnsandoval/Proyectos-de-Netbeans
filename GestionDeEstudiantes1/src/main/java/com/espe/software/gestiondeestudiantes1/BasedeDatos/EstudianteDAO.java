/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.gestiondeestudiantes1.BasedeDatos;

/**
 *
 * @author Derek
 */

import com.espe.software.gestiondeestudiantes1.Modelo.Estudiante;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import org.bson.conversions.Bson;

public class EstudianteDAO {
    
    private static final String NOMBRE_COLECCION = "Estudiantes";

    // 1. Método de ayuda para obtener la colección
    private MongoCollection<Document> getCollection() {
        MongoDatabase db = ConnectionMongoDB.getDatabase();
        if (db == null) {
            System.err.println("Error: No se pudo obtener la base de datos.");
            return null;
        }
        return db.getCollection(NOMBRE_COLECCION);
    }
    
    // 2. Método de ayuda para convertir el objeto Java a Document de MongoDB
    private Document estudianteToDocument(Estudiante estudiante) {
        // Incluimos el ID que el usuario ingresa
        Document doc = new Document("id", estudiante.getId()) 
                .append("Nombre", estudiante.getNombre())
                .append("Apellido", estudiante.getApellido())
                .append("Email", estudiante.getEmail())
                .append("Edad", estudiante.getEdad())
                .append("Carrera", estudiante.getCarrera());
        return doc;
    }

    // --- MÉTODOS CRUD ---

    public boolean insertarEstudiante(Estudiante estudiante) {
        MongoCollection<Document> collection = getCollection();
        if (collection == null) return false;

        try {
            collection.insertOne(estudianteToDocument(estudiante));
            System.out.println("✅ Documento Insertado Exitosamente.");
            return true;
        } catch (Exception e) {
            System.err.println("Error al insertar estudiante: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarEstudiante(String idBusqueda, Estudiante estudianteActualizado) {
        MongoCollection<Document> collection = getCollection();
        if (collection == null) return false;
        
        try {
            Bson filtro = eq("id", idBusqueda);
            
            // Usamos $set para actualizar solo los campos provistos
            Document datosNuevos = new Document("$set", estudianteToDocument(estudianteActualizado));
            
            UpdateResult resultado = collection.updateOne(filtro, datosNuevos);
            
            if (resultado.getModifiedCount() > 0) {
                System.out.println("✅ Estudiante con ID " + idBusqueda + " actualizado correctamente.");
                return true;
            } else {
                System.out.println("⚠️ No se encontró ningún estudiante con ID " + idBusqueda + " para actualizar.");
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error al actualizar estudiante: " + e.getMessage());
            return false;
        }
    }
    
    public boolean eliminarEstudiante(String idBusqueda) {
        MongoCollection<Document> collection = getCollection();
        if (collection == null) return false;
        
        try {
            Bson filtro = eq("id", idBusqueda);
            
            DeleteResult resultado = collection.deleteOne(filtro);
            
            if (resultado.getDeletedCount() > 0) {
                System.out.println("✅ Estudiante con ID " + idBusqueda + " eliminado correctamente.");
                return true;
            } else {
                System.out.println("⚠️ No se encontró ningún estudiante con ID " + idBusqueda + " para eliminar.");
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error al eliminar estudiante: " + e.getMessage());
            return false;
        }
    }
    
    // Método para BUSCAR/LEER, muy útil para la interfaz gráfica
    public Estudiante buscarEstudiantePorId(String idBusqueda) {
        MongoCollection<Document> collection = getCollection();
        if (collection == null) return null;

        try {
            Document doc = collection.find(eq("id", idBusqueda)).first();
            
            if (doc != null) {
                // Convertir Document a Estudiante
                Estudiante est = new Estudiante(
                    doc.getString("id"),
                    doc.getString("Nombre"),
                    doc.getString("Apellido"),
                    doc.getString("Email"),
                    doc.getInteger("Edad"),
                    doc.getString("Carrera")
                );
                return est;
            }
        } catch (Exception e) {
             System.err.println("Error al buscar estudiante: " + e.getMessage());
        }
        return null;
    }
}