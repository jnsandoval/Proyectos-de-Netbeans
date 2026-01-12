/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.principioid;

/**
 *
 * @author labesp
 */
public class GeneradorDeReportes {
    
    GeneradorReportes generadorReportes;
    
    public void generarReporte(){
        generadorReportes.GenerarReporte("NombreReporte");
    }

    public GeneradorDeReportes(GeneradorReportes generadorReportes) {
        this.generadorReportes = generadorReportes;
    }
    
}
