/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.tiposdeclase;

/**
 *
 * @author labesp
 */
public class TiposdeClase {

    private int TiposdeClase = 10;
    
    // Clase interna miembro
    public class ClaseInterna {
    
        public void mostrarCampoExterno(){
            // Accede directamente al campo privado de la clase externa
            System.out.println(TiposdeClase);
        }
    }
    
    // El método main para la ejecución
    public static void main(String[] args) {
    
        // 1. Crear una instancia de la Clase Externa (CampoExterno)
        TiposdeClase externa = new TiposdeClase();

        // 2. Crear una instancia de la Clase Interna (ClaseInterna)
        // Se requiere una instancia de la clase externa para crear una instancia de la clase interna miembro.
        TiposdeClase.ClaseInterna interna = externa.new ClaseInterna();

        // 3. Invocar el método de la Clase Interna
        interna.mostrarCampoExterno(); // Salida 10
    }
}