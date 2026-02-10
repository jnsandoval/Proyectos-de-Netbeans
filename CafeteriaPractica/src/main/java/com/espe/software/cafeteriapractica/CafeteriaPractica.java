/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.cafeteriapractica;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class CafeteriaPractica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        PedidosCafeteria cafeteria = new PedidosCafeteria();
        
        System.out.println("Cafeteria");
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Que deseas hacer?");
            System.out.println("1. Tomar orden");
            System.out.println("2. Preparar orden");
            System.out.println("3. Salir");
            
            int opcion = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    System.out.println("Nombre del cliente: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Que quiere?: ");
                    String producto = teclado.nextLine();
                    ClienteReal nuevo = new ClienteReal(nombre, producto);
                    cafeteria.registrarPedido(nuevo);
                }
                case 2 -> {
                    System.out.println("Ingresa el numero de pedido que esta preparado: ");
                    int numListo = teclado.nextInt();
                    cafeteria.marcarPedidoListo(numListo);
                    System.out.println("");
                }
                case 3 -> {
                    continuar = false;
                    System.out.println("Saliendo");
                }
                default -> {
                }
            }
        }
    }
}
                 
   

