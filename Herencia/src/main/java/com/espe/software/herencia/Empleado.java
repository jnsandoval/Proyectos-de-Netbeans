/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.herencia;

/**
 *
 * @author labesp
 */
public class Empleado {

    
    int exp; 

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public double calcularSalario() {
        int salario = exp * 50000;
        return salario;
    }
}
