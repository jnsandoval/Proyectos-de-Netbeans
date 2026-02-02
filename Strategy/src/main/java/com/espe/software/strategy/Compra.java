/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.strategy;

/**
 *
 * @author labesp
 */
public class Compra {

    private MetodoPago metodo;

    public void setMetodoPago(MetodoPago metodo) {
        this.metodo = metodo;
    }
    
    public void realizarPago(double monto){
        metodo.pagar(monto);
    }
}
