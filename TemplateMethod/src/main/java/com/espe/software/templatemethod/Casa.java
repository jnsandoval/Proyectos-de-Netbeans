/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.templatemethod;

/**
 *
 * @author labesp
 */
public abstract class Casa {
    
    public void construirCasa(){
        ConstruirCimientos();
        ConstruirColumnas();
        ConstruirParedes();
        ColocarPuertas();
        ColocarVentanas();
        System.out.println("Casa terminada");
    }
    

    private void ConstruirCimientos() {
        System.out.println("Construyendo cimientos");
    }

    private void ConstruirColumnas() {
        System.out.println("Construyendo columnas");
    }

    protected abstract void ConstruirParedes();

    protected abstract void ColocarPuertas();

    protected abstract void ColocarVentanas();
}
