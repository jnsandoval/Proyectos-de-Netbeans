/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author labesp
 */

import controlador.ControladorEvento;
import modelo.Evento;
import java.util.Scanner;

public class VistaEvento {
    public static void main (String[] args){
        
        Scanner sc= new Scanner(System.in);
        ControladorEvento control = new ControladorEvento();
        
        System.out.print("Ingrese ID del evento: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Ingrese nombre del evento: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese fecha (DD/MM/AAAA): ");
        String fecha = sc.nextLine();
        
        System.out.print("Ingrese lugar: ");
        String lugar = sc.nextLine();
        
        System.out.print("Ingrese descripción: ");
        String descripcion = sc.nextLine();
        
        Evento nuevoEvento = new Evento(id, nombre, fecha, lugar, descripcion);
        
        control.agregarEvento(nuevoEvento);
        
        System.out.println("LISTA DE EVENTOS:");
        control.listarEventos();
        
        sc.close();
    }
}
