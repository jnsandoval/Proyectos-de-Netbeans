/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.tiposdeherencia;

/**
 *
 * @author labesp
 */
public class TiposdeHerencia {

    public static void main(String[] args) {
        
        System.out.println("1. DEMOSTRACION DE HERENCIA SIMPLE (Padre1 -> Hijo1)");
        Hijo1 simple = new Hijo1();
        
        System.out.print("Hijo1 llama a display(): ");
        simple.display(); 
        
        System.out.print("Hijo1 llama a mostrar(): ");
        simple.mostrar(); 

        System.out.println("2. DEMOSTRACION DE HERENCIA MULTINIVEL (Padre1 -> Hijo1 -> Hijo2)");
        Hijo2 multinivel = new Hijo2();
        
        System.out.print("Hijo2 llama a display(): ");
        multinivel.display(); 
       
        System.out.print("Hijo2 llama a mostrar(): ");
        multinivel.mostrar(); 
        
        System.out.print("Hijo2 llama a imprimir(): ");
        multinivel.imprimir();
        
        System.out.println("3. DEMOSTRACION DE HERENCIA JERARQUICA (Padre1 -> Hijo1 & Padre1 -> Hijo2)");

        System.out.print("Hijo1 usa display(): ");
        simple.display(); 
        
        System.out.print("Hijo2 usa display(): ");
        multinivel.display(); 
    }
}