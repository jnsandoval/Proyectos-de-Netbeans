/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.espe.software.principiosi;

/**
 *
 * @author labesp
 */
public interface ServiciosDeTransaccion {
    
    public void hacerDeposito(int numeroCuenta, double monto);
    public void hacerRetiro(int numeroCuenta, double monto);

}
