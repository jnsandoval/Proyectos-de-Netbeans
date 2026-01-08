/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.principiosr;

/**
 *
 * @author labesp
 */
public class ImprimirFactura {
    private Factura factura;

    public ImprimirFactura(Factura factura) {
        this.factura = factura;
    }
    
    public void imprimir(){
        System.out.println(factura.getCantidad() + "x " + factura.getLibro().nombre + " " + factura.getLibro().precio);
        System.out.println("porcentaje de descuento " + factura.getDescuento());
        System.out.println("impuestos " + factura.getImpuesto());
        System.out.println("Total " + factura.getTotal());
    }
}
