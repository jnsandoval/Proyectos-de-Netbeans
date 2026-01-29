/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.templatemethod;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class TemplateMethod {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Casa miCasa;
        
        
        System.out.println("CONSTRUCTURA");
        System.out.println("Que tipo de casa quiere construir?");
        System.out.println("1. Casa de Madera");
        System.out.println("2. Casa de Cemento");
        System.out.println("");
        
        
        int opcion = scan.nextInt();
        
        if (opcion ==1){
            System.out.println("Constuyendo casa de Madera:");
            miCasa = new CasaMadera();
            miCasa.construirCasa();
        } else if (opcion ==2){
            System.out.println("Constuyendo casa de Cemento:");
            miCasa = new CasaCemento();
            miCasa.construirCasa();
        }
    }
}
