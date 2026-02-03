/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.strategy;

/**
 *
 * @author labesp
 */
public class PagoTransferencia implements MetodoPago{
    
    private String nombre;
    private String banco;
    private String numeroComprobante;
    
    public PagoTransferencia(String nombre, String banco, String numeroComprobante) {
        this.nombre = nombre;
        this.banco = banco;
        this.numeroComprobante = numeroComprobante;
    }
        
    @Override
    public void pagar(double monto) {
        System.out.println("Se uso Transferencia Bancaria con un monto de " + monto + " $");
        System.out.println("Banco: " + banco);
        System.out.println("Comprobante Nro: " + numeroComprobante);
        System.out.println("A nombre de: " + nombre);
    }
    
}
