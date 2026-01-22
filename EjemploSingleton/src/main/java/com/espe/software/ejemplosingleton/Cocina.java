/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.ejemplosingleton;

/**
 *
 * @author labesp
 */
public class Cocina {
    
    private static Cocina cocina = null;
    
    public static Cocina obtenerInstancia(){
        if (cocina == null) {
            cocina = new Cocina();
        }
        return cocina;
    }
    
    private Cocina(){
        
    }
    
    boolean agregoSal = false;
    
    public void hacerSopa(){
        if (!agregoSal){
            System.out.println("Agregando sal");
            agregoSal = true;
        }
    }
    
}
