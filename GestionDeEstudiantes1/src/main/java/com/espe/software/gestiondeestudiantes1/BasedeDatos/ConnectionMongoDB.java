/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.gestiondeestudiantes1.BasedeDatos;

/**
 *
 * @author labesp
 */

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class ConnectionMongoDB {
    
    private static final String HOST = "localhost";
    private static final int PUERTO = 27017;
    private static final String NOMBRE_DB = "Tareas"; // O el nombre real de tu DB
    
    private static MongoClient mongoClient = null;

    /**
     * Obtiene una instancia del cliente de MongoDB.
     * @return MongoClient o null si la conexión falla.
     */
    public static MongoClient getMongoClient() {
        if (mongoClient == null) {
            try {
                // Conexión al servidor MongoDB
                mongoClient = new MongoClient(HOST, PUERTO);
                System.out.println("Conexión a MongoDB establecida exitosamente.");
            } catch (Exception e) {
                System.err.println("Error al conectar con MongoDB: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return mongoClient;
    }

    /**
     * Obtiene la base de datos especificada.
     * @return MongoDatabase o null si no se pudo conectar.
     */
    public static MongoDatabase getDatabase() {
        MongoClient client = getMongoClient();
        if (client != null) {
            return client.getDatabase(NOMBRE_DB);
        }
        return null;
    }

    /**
     * Cierra la conexión a MongoDB.
     */
    public static void closeConnection() {
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null;
            System.out.println("Conexión a MongoDB cerrada.");
        }
    }
}