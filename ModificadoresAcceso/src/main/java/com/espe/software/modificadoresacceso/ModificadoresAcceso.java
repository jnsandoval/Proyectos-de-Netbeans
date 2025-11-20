/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.modificadoresacceso;

/**
 *
 * @author labesp
 */



import java.util.Scanner;

public class ModificadoresAcceso {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su Edad, Nombre, Ciudad");

        int age = sc.nextInt();
        String name = sc.next();
        String city = sc.next();

        System.out.println("Edad: " + age);
        System.out.println("Nombre: " + name);
        System.out.println("Ciudad: " + city);

        sc.close();
    }
}
