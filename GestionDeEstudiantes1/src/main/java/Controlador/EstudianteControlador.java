/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.List;
import java.util.ArrayList;
import com.espe.software.gestiondeestudiantes1.Modelo.Estudiante;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author labesp
 */
public class EstudianteControlador {
    
    public List<Estudiante> Listar(){
        List<Estudiante> listaEstudiantes = new ArrayList<>(); 
        
        try (MongoClient mongoClient = new MongoClient("localhost", 27017)){ 
            
            MongoDatabase orderDatabase = mongoClient.getDatabase("GestionEstudiantes"); 
            MongoCollection<Document> coleccionEstudiante = orderDatabase.getCollection("Estudiantes"); 
            
            for (Document doc : coleccionEstudiante.find()){
                Estudiante e = new Estudiante( 
                    doc.getString("id"), 
                    doc.getString("Nombre"),
                    doc.getString("Apellido"),
                    doc.getString("Email"),
                        
                    doc.getInteger("Edad"),
                    
                    doc.getString("Carrera")
                );
                
                listaEstudiantes.add(e); 
            }
            
            return listaEstudiantes;
            
        } catch (Exception exe) { 
            System.err.println("Error al listar estudiantes: " + exe.getMessage());
            return listaEstudiantes; 
        }
    }
}