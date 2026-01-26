/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.fabricadehelados;

/**
 *
 * @author labesp
 */
public class Cliente {
   
    public static void main(String[] args) {
        
        // TOPSY//
        
        FabricaHelados fTopsy = new FabricaTopsy();
        Paleta mipaletaTopsy = fTopsy.createPaleta();
        MilkShake miBatidoTopsy = fTopsy.createMilkShake();
        
        mipaletaTopsy.mostrarSabor();
        miBatidoTopsy.mostrarTipo();
        
        //Pinguino//
        
        FabricaHelados fPinguino = new FabricaPinguino();
        Paleta mipaletaPinguino = fPinguino.createPaleta();
        MilkShake miBatidoPinguino = fPinguino.createMilkShake();
        
        mipaletaPinguino.mostrarSabor();
        miBatidoPinguino.mostrarTipo();
        
        }
    }



