/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.principiosr;

/**
 *
 * @author labesp
 */
public class Factura {
    private Libro libro;
    private int cantidad;
    private double descuento;
    private double impuesto;
    private double total;

    public Factura(Libro libro, int cantidad, double descuento, double impuesto, double total) {
        this.libro = libro;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.impuesto = impuesto;
        this.total = this.calcularTotal();
    }
    
    public double calcularTotal(){
        double precio = ((libro.precio - libro.precio*descuento) * this.cantidad);
        double precioConImpuestos = precio * (1+impuesto);
        return precioConImpuestos;  
    }

    public Libro getLibro() {
        return libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public double getTotal() {
        return total;
    }
        
}
