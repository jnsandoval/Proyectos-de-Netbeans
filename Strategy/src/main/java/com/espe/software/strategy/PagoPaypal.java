/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.strategy;

/**
 *
 * @author labesp
 */
public class PagoPaypal implements MetodoPago{

    private String email;
    private String password;
    
    public PagoPaypal(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + "uso Paypal y su usario es: "+ email);
    }
    
}
