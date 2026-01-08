/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.principiooc;

import java.util.List;

/**
 *
 * @author labesp
 */
public class CalculadoraDeAreas {
    
    /*
    
    public double calcularAreaRectangulo(double alto, double ancho){
        return alto * ancho;
    }
    
    public double CalcularAreaCirculo(double radio){
        return Math.PI * radio * radio;
    }
    
    */
    private List<Figura> figuras;

    public CalculadoraDeAreas(List<Figura> figuras) {
        this.figuras = figuras;
    }
    
    public double calcular (){
        double area = 0;
        for(Figura figura:figuras){
            area += figura.CalcularArea();
        }
        return area;
    }
}
