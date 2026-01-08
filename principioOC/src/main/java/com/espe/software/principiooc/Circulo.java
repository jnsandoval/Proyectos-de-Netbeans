/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.principiooc;

/**
 *
 * @author labesp
 */
public class Circulo implements Figura {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double CalcularArea() {
        return Math.PI*radio*radio;
    }
    
}
