/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.strategy;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Strategy {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Compra miCompra = new Compra();
        
        System.out.println("Monto a pagar: ");
        double monto = leer.nextDouble();
        leer.nextLine();
        
        System.out.println("Como desea pagar?");
        System.out.println("1. Tarjeta   -   2.Paypal   -   3.Transferencia");
        int opcion =leer.nextInt();
        leer.nextLine();
        
        if (opcion ==1){
            
            System.out.println("-Datos de Tarjeta de Credito-");
            System.out.println("Nombre del titular: ");
            String nombre = leer.nextLine();
            System.out.println("Numero de tarjeta: ");
            String numero = leer.nextLine();
            System.out.println("CVV: ");
            String cvv = leer.nextLine();
            System.out.println("Fecha de expiracion: ");
            String fecha = leer.nextLine();
            
            miCompra.setMetodoPago(new PagoTarjetaCredito(nombre, numero, cvv, fecha));
        }
        else if (opcion == 2){
            System.out.println("-Datos de PayPal-");
            System.out.println("Email: ");
            String email = leer.nextLine();
            System.out.println("Contraseña: ");
            String password = leer.nextLine();
            
            miCompra.setMetodoPago(new PagoPaypal(email, password));
        } 
        else if (opcion ==3){
            System.out.println("-Datos de Transferencia-");
            System.out.println("Nombre del beneficiario: ");
            String nombre = leer.nextLine();
            System.out.println("Nombre del Banco: ");
            String banco = leer.nextLine();
            System.out.println("Numero de comprobante: ");
            String comprobante = leer.nextLine();
            
            miCompra.setMetodoPago(new PagoTransferencia(nombre, banco, comprobante));
        }
        
        miCompra.realizarPago(monto);
    
    }
}
