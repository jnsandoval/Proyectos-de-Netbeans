/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.interfaces;

/**
 *
 * @author labesp
 */
public class Interfaces {

    public static void main(String[] args) {
        
        System.out.println("PRUEBA DE IMPLEMENTACION 1 ");
      
        University college1 = new College();
        
        System.out.print("Cursos de College: ");
        college1.courses();
        
        System.out.print("Deportes de College: ");
        college1.sports();
        
        System.out.println("PRUEBA DE IMPLEMENTACION 2");
        
        University college2 = new College2();
        
        System.out.print("Cursos de College2: ");
        college2.courses();
        
        System.out.print("Deportes de College2: ");
        college2.sports();
    }
}
