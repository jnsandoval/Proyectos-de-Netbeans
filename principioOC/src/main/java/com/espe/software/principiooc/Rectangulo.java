/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.principiooc;

/**
 *
 * @author labesp
 */
public class Rectangulo implements Figura{

    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    
    @Override
    public double CalcularArea() {
        return alto * ancho;
    }
    
}
