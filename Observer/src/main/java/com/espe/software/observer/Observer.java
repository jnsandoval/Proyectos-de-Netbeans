/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.observer;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class Observer {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AgenciaNoticias agencia = new AgenciaNoticias();
        
        agencia.suscribir(new CanalNoticia1());
        agencia.suscribir(new CanalNoticia2());
        agencia.suscribir(new CanalNoticia3());
              
        System.out.println("Escriba las noticias");
        String texto = leer.nextLine();
        
        agencia.publicarNoticia(texto);
    }
}
