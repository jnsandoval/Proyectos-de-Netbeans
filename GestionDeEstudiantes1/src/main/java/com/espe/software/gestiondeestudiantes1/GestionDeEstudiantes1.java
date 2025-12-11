/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.gestiondeestudiantes1;

/**
 *
 * @author labesp
 */
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class GestionDeEstudiantes1 {
    public static void main(String[] args) {
        try {
            // Conexión al servidor MongoDB en localhost, puerto 27017
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            // Selección de la base de datos
            MongoDatabase tareasDatabase = mongoClient.getDatabase("Tareas");
            System.out.println("Nombre base de datos = " + tareasDatabase.getName());

            // Selección de la colección
            MongoCollection<Document> estudiantesCollection = tareasDatabase.getCollection("Estudiantes");
            System.out.println("Colección obtenida correctamente: " + estudiantesCollection.getNamespace());

            // Crear un nuevo documento
            Document docEstudiante = new Document("Nombre", "Martha")
                    .append("Edad", 34)
                    .append("Puesto", "Secretario");

            // Insertar el documento en la colección
            estudiantesCollection.insertOne(docEstudiante);
            System.out.println("Documento Insertado Exitosamente");

            // Cerrar conexión
            mongoClient.close();
        } catch (Exception exe) {
            exe.printStackTrace();
        }
    }
}