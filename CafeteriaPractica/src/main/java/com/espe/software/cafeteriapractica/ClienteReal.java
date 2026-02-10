/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.cafeteriapractica;

/**
 *
 * @author labesp
 */
public class ClienteReal implements Cliente {
    
    private String pedido;
    private String nombre;
    private int miNumeroPedido;
    private static int contadorPedidos = 1;
   
    public ClienteReal(String nombre, String pedido) {
        this.nombre = nombre;
        this.pedido = pedido;
        this.miNumeroPedido = contadorPedidos++;
    }

    @Override
    public void recibirLlamado(int numListo) {
        if (this.miNumeroPedido == numListo) {
            System.out.println("Cliente " + nombre + " su pedido esta listo de: " + pedido + ", acerquse a retirar");
        }
    }
}