/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.sobrecargametodos;

/**
 *
 * @author labesp
 */

public class SobrecargaMetodos {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora(); 

       
        System.out.println("Suma de enteros (5, 10): " + calc.sumar(5, 10));      
        System.out.println("Suma de dobles (3.5, 2.5): " + calc.sumar(3.5, 2.5));   
        System.out.println("Suma de tres enteros (2, 4, 6): " + calc.sumar(2, 4, 6)); 
    }
}
