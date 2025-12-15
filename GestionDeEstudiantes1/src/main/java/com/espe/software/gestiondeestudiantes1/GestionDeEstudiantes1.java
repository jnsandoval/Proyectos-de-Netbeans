/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.gestiondeestudiantes1;

/**
 *
 * @author labesp
 */


import com.espe.software.gestiondeestudiantes1.BasedeDatos.ConnectionMongoDB;
import com.espe.software.gestiondeestudiantes1.BasedeDatos.EstudianteDAO; // <--- NUEVA IMPORTACIÓN
import com.espe.software.gestiondeestudiantes1.Modelo.Estudiante;
import java.util.Scanner;


public class GestionDeEstudiantes1 {
    
    private static final Scanner scanner = new Scanner(System.in);
    // 🚨 Instanciar el DAO para usar sus métodos
    private static final EstudianteDAO estudianteDAO = new EstudianteDAO(); 

    public static void main(String[] args) {
        menuPrincipal();
    }
    
    // El método solicitarDatosEstudiante() se mantiene igual.
    // ... (el método de solicitud de datos sigue aquí)

    public static Estudiante solicitarDatosEstudiante() {
        // ... (Tu codigo de solicitud de datos por consola sigue aquí, lo omito por brevedad)
        Estudiante estudiante = new Estudiante();
        
        System.out.println("---INGRESO DE NUEVO ESTUDIANTE---");
        System.out.print("Ingrese ID (unico): ");
        estudiante.setId(scanner.nextLine());
        
        System.out.print("Ingrese Nombre: ");
        estudiante.setNombre(scanner.nextLine());
        
        System.out.print("Ingrese Apellido: ");
        estudiante.setApellido(scanner.nextLine());
        
        System.out.print("Ingrese Email: ");
        estudiante.setEmail(scanner.nextLine());

        int edad = -1;
        while (edad <= 0) {
            try {
                System.out.print("Ingrese Edad: ");
                edad = Integer.parseInt(scanner.nextLine());
                if (edad <= 0) System.out.println("La edad debe ser un numero positivo.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Por favor, ingrese un numero para la edad.");
            }
        }
        estudiante.setEdad(edad);
        
        System.out.print("Ingrese Carrera: ");
        estudiante.setCarrera(scanner.nextLine());
        
        return estudiante;
    }


    // --- MENU PRINCIPAL (Ahora llama al DAO) ---
    
    public static void menuPrincipal() {
        int opcion = -1;
        do {
            System.out.println("--- GESTION DE ESTUDIANTES ---");
            System.out.println("1. Insertar Estudiante");
            System.out.println("2. Actualizar Estudiante por ID");
            System.out.println("3. Eliminar Estudiante por ID");
            System.out.println("4. Buscar Estudiante por ID"); // Agregado para probar la busqueda
            System.out.println("0. Salir y cerrar conexion");
            System.out.print("Seleccione una opcion: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                
                switch (opcion) {
                    case 1:
                        Estudiante nuevo = solicitarDatosEstudiante();
                        // 👈 Solo llama al DAO
                        estudianteDAO.insertarEstudiante(nuevo); 
                        break;
                    case 2:
                        System.out.print("Ingrese el ID del estudiante a actualizar: ");
                        String idUpdate = scanner.nextLine();
                        Estudiante datosNuevos = solicitarDatosEstudiante();
                        datosNuevos.setId(idUpdate); 
                        // 👈 Solo llama al DAO
                        estudianteDAO.actualizarEstudiante(idUpdate, datosNuevos); 
                        break;
                    case 3:
                        System.out.print("Ingrese el ID del estudiante a eliminar: ");
                        String idDelete = scanner.nextLine();
                        // 👈 Solo llama al DAO
                        estudianteDAO.eliminarEstudiante(idDelete); 
                        break;
                    case 4:
                        System.out.print("Ingrese el ID del estudiante a buscar: ");
                        String idSearch = scanner.nextLine();
                        Estudiante encontrado = estudianteDAO.buscarEstudiantePorId(idSearch);
                        if (encontrado != null) {
                            System.out.println("Estudiante encontrado: " + encontrado);
                        } else {
                            System.out.println("Estudiante no encontrado.");
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opcion no valida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un numero para la opcion.");
                opcion = -1;
            }
            
        } while (opcion != 0);

        ConnectionMongoDB.closeConnection();
    }
}