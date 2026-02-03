/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.strategy;

/**
 *
 * @author labesp
 */
public class PagoTarjetaCredito implements MetodoPago{

    private String nombreCliente;
    private String numeroTarjeta;
    private String CVV;
    private String fechaExpiracion;
    
    public PagoTarjetaCredito(String nombreCliente, String numeroTarjeta, String CVV, String fechaExpiracion) {
        this.nombreCliente = nombreCliente;
        this.numeroTarjeta = numeroTarjeta;
        this.CVV = CVV;
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void pagar(double monto) {
        
        System.out.println("Se uso Tarjeta de Credito con un monto de " + monto + " $");
        
        System.out.println("El titular es: " + nombreCliente);
    
    }
    
}
