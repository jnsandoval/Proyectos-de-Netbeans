/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.appredessociales;

/**
 *
 * @author labesp
 */
public class RedSocialMultimedia {
    
    private RedSocial estrategia;
    
    public void setEstrategia (RedSocial estrategia){
        this.estrategia = estrategia;
    }
    
    public void ejecutarConexion(){
        estrategia.conectar();
    }
    
}
