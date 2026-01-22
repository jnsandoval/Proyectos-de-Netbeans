/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.ejemplosingleton;

/**
 *
 * @author labesp
 */
public class EjemploSingleton {

    public static void main(String[] args) {
        
        Cocina cocina1 = Cocina.obtenerInstancia();
        Cocina cocina2 = Cocina.obtenerInstancia();
        Cocina cocina3 = Cocina.obtenerInstancia();

        cocina1.hacerSopa(); 
        cocina2.hacerSopa(); 
        cocina3.hacerSopa(); 
    }
}
