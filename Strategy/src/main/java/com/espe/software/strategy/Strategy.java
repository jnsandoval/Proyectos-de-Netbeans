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
        
        System.out.println("Como desea pagar?");
        System.out.println("1. Tarjeta   -   2.Paypal");
        int opcion =leer.nextInt();
        
        if (opcion ==1){
            miCompra.setMetodoPago(new PagoTarjetaCredito("Jostyn","1234","123","10/26"));
        }
        else if (opcion == 2){
            miCompra.setMetodoPago(new PagoPaypal("jnsandoval@espe.edu.ec", "1234"));
        }
        
    }
}
