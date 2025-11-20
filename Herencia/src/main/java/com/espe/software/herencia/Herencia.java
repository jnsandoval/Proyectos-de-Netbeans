/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.herencia;

/**
 *
 * @author labesp
 */
public class Herencia {

    public static void main(String[] args) {
        
        EmpleadoFijo permEmp = new EmpleadoFijo();

        System.out.println("Ejecutando Ejemplo de Herencia");

        System.out.print("Metodo propio (doFun): ");
        permEmp.doFun(); 

        permEmp.setExp(5); 
        System.out.println("Experiencia (Exp) establecida a 5 usando setExp() heredado.");
        
        double salario = permEmp.calcularSalario(); 
        
        System.out.println("Salario calculado (calcularSalario): " + salario);


    }
}
