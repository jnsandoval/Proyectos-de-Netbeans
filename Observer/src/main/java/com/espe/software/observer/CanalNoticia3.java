/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.observer;

/**
 *
 * @author labesp
 */
public class CanalNoticia3 implements Canal{

    @Override
    public void recibir(String noticia) {
        System.out.println("Canal 3 - WEB: " + noticia);
    }
    
}
