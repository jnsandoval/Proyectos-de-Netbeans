/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labesp
 */
public class AgenciaNoticias {
    private List<Canal> canales = new ArrayList<>();
    
    public void suscribir(Canal canal){
        this.canales.add(canal);
    }
    
    public void publicarNoticia(String noticia){
        for (Canal c : canales){
            c.recibir(noticia);
        } 
    }
}
