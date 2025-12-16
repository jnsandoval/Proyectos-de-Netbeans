/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionestudiantes.basedatos;

/**
 *
 * @author DELL
 */

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class ConexionMongoDB {
    
    // Configuración de conexión
    private static final String URI = "mongodb://localhost:27017";
    private static final String DB_NAME = "Trabajo";
    
    // Cliente singleton para reutilizar la conexión
    private static MongoClient mongoClient = null;
    
    /**
     * Establece conexión con MongoDB y retorna la base de datos
     * @return MongoDatabase objeto para operar con la base de datos
     */
    public static MongoDatabase conectar() {
        try {
            System.out.println("🔌 =========================================");
            System.out.println("🔌 Intentando conectar a MongoDB...");
            System.out.println("🔌 URI: " + URI);
            System.out.println("🔌 Base de datos: " + DB_NAME);
            
            // Crear cliente si no existe
            if (mongoClient == null) {
                mongoClient = MongoClients.create(URI);
                System.out.println("✅ Cliente MongoDB creado exitosamente");
            }
            
            // Obtener base de datos
            MongoDatabase database = mongoClient.getDatabase(DB_NAME);
            
            // Probar la conexión listando colecciones
            database.listCollectionNames().first();
            
            System.out.println("✅ Conexión establecida correctamente");
            System.out.println("✅ Base de datos: " + database.getName());
            System.out.println(" =========================================");
            
            return database;
            
        } catch (Exception e) {
            System.err.println("❌ =========================================");
            System.err.println("❌ ERROR DE CONEXIÓN A MONGODB");
            System.err.println("❌ Mensaje: " + e.getMessage());
            System.err.println("❌ Causa: " + e.getCause());
            System.err.println("");
            System.err.println("⚠️  SOLUCIÓN: Verifica lo siguiente:");
            System.err.println("   1. ¿MongoDB está ejecutándose?");
            System.err.println("      → Comando: mongod (en terminal)");
            System.err.println("");
            System.err.println("   2. ¿El puerto 27017 está disponible?");
            System.err.println("      → Comando: netstat -ano | findstr :27017");
            System.err.println("");
            System.err.println("   3. ¿Tienes MongoDB Compass instalado?");
            System.err.println("      → Ábrelo y verifica la conexión");
            System.err.println("❌ =========================================");
            
            // Mostrar stack trace para debugging
            e.printStackTrace();
            
            throw new RuntimeException("No se pudo conectar a MongoDB. " +
                "Asegúrate de que el servicio esté ejecutándose.", e);
        }
    }
    
    /**
     * Cierra la conexión con MongoDB
     */
    public static void cerrarConexion() {
        if (mongoClient != null) {
            try {
                mongoClient.close();
                mongoClient = null;
                System.out.println("Conexión a MongoDB cerrada correctamente");
            } catch (Exception e) {
                System.err.println("⚠️  Error al cerrar conexion: " + e.getMessage());
            }
        }
    }
    
    /**
     * Verifica si MongoDB está disponible
     * @return true si se puede conectar, false en caso contrario
     */
    public static boolean probarConexion() {
        try {
            MongoDatabase db = conectar();
            db.listCollectionNames().first();
            System.out.println("✅ Prueba de conexión: EXITOSA");
            return true;
        } catch (Exception e) {
            System.err.println("❌ Prueba de conexión: FALLIDA");
            return false;
        }
    }
    
    /**
     * Método main para probar la conexión manualmente
     */
    public static void main(String[] args) {
        System.out.println(" Iniciando prueba de conexión a MongoDB...");
        
        if (probarConexion()) {
            System.out.println("¡Todo funciona correctamente!");
            
            // Mostrar colecciones disponibles
            try {
                MongoDatabase db = conectar();
                System.out.println("\n📂 Colecciones en la base de datos '" + DB_NAME + "':");
                db.listCollectionNames().forEach(collection -> {
                    System.out.println("   - " + collection);
                });
            } catch (Exception e) {
                System.err.println("⚠️  No se pudieron listar las colecciones: " + e.getMessage());
            }
        } else {
            System.err.println("💥 No se pudo establecer conexión con MongoDB");
        }
        
        cerrarConexion();
    }
}