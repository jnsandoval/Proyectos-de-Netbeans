/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionestudiantes.controlador;

/**
 *
 * @author DELL
 */

import com.mycompany.gestionestudiantes.basedatos.ConexionMongoDB;
import com.mycompany.gestionestudiantes.modelo.Estudiante;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

public class EstudianteControlador {
    
    private MongoCollection<Document> coleccion;
    
    public EstudianteControlador() {
        // CONEXIÓN A MONGODB 
        MongoDatabase db = ConexionMongoDB.conectar();
        // COLECCIÓN: Empleados (la que ya tienes)
        coleccion = db.getCollection("Empleados");
    }
    
    // CREAR - IMPORTANTE: retorna boolean
    public boolean crear(Estudiante e) {
        try {
            // Usar _id (con guión bajo) no id
            Document doc = new Document("_id", e.getId())
                .append("nombre", e.getNombre())
                .append("apellido", e.getApellido())
                .append("email", e.getEmail())
                .append("edad", e.getEdad())
                .append("carrera", e.getCarrera());
            
            coleccion.insertOne(doc);
            System.out.println("GUARDADO: " + e.getId() + " - " + e.getNombre());
            return true;
            
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
            return false;
        }
    }
    
    // ACTUALIZAR - retorna boolean
    public boolean actualizar(Estudiante e) {
        try {
            Document filtro = new Document("_id", e.getId());
            Document datos = new Document("$set",
                new Document("nombre", e.getNombre())
                    .append("apellido", e.getApellido())
                    .append("email", e.getEmail())
                    .append("edad", e.getEdad())
                    .append("carrera", e.getCarrera()));
            
            UpdateResult result = coleccion.updateOne(filtro, datos);
            return result.getModifiedCount() > 0;
            
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
            return false;
        }
    }
    
    // ELIMINAR - retorna boolean
    public boolean eliminar(int id) {
        try {
            Document filtro = new Document("_id", id);
            DeleteResult result = coleccion.deleteOne(filtro);
            return result.getDeletedCount() > 0;
            
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
            return false;
        }
    }
    
    // LISTAR
    public List<Estudiante> listar() {
        List<Estudiante> lista = new ArrayList<>();
        
        try {
            for (Document doc : coleccion.find()) {
                // Solo tomar documentos con campo "nombre" (nuestros)
                if (doc.containsKey("nombre")) {
                    Estudiante e = new Estudiante(
                        doc.getInteger("_id"),
                        doc.getString("nombre"),
                        doc.getString("apellido"),
                        doc.getString("email"),
                        doc.getInteger("edad"),
                        doc.getString("carrera")
                    );
                    lista.add(e);
                }
            }
        } catch (Exception ex) {
            System.out.println("ERROR al listar: " + ex.getMessage());
        }
        
        return lista;
    }
}