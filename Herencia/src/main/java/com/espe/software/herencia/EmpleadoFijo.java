/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.herencia;

/**
 *
 * @author labesp
 */

public class EmpleadoFijo extends Empleado {

    public void doFun() {
        System.out.println("divirtiéndose");
    }

    public static void main(String[] args) {
        EmpleadoFijo permEmp = new EmpleadoFijo();

        permEmp.doFun(); 
        
        permEmp.setExp(5); 
        
        double salario = permEmp.calcularSalario(); 
        System.out.println(salario);
    }
}
