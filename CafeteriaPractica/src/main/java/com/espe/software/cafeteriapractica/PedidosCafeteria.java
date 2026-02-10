/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.cafeteriapractica;

/**
 *
 * @author labesp
 */
import java.util.ArrayList;
import java.util.List;

public class PedidosCafeteria {
    private List<Cliente> listaPedidos = new ArrayList<>();
    private int pedidoListo;

    public void registrarPedido(Cliente cliente) {
        listaPedidos.add(cliente);
        System.out.println("Nuevo cliente registrado en la fila.");
        System.out.println("");
    }

    public void eliminarPedido(Cliente cliente) {
        listaPedidos.remove(cliente);
        System.out.println("Cliente retirado de la lista.");
    }

    public void marcarPedidoListo(int num) {
        this.pedidoListo = num;
        System.out.println("Pedido #" + num + " esta listo");
        notificarPedido(num);
    }

    public void notificarPedido(int num) {
        for (Cliente c : listaPedidos) {
            c.recibirLlamado(num);
        }
    }
}