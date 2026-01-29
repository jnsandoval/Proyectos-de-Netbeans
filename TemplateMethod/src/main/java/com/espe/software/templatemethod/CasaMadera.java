/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.templatemethod;

/**
 *
 * @author labesp
 */
public class CasaMadera extends Casa{

    @Override
    protected void ConstruirParedes() {
        System.out.println("Construyendo paredes con madera");
    }

    @Override
    protected void ColocarPuertas() {
        System.out.println("Construyendo puertas con madera");
    }

    @Override
    protected void ColocarVentanas() {
        System.out.println("Construyendo ventanas con madera");
    }
    
}
