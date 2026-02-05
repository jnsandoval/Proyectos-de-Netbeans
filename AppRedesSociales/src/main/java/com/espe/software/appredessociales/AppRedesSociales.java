/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.appredessociales;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class AppRedesSociales {
    
    public static void main(String[] args) {
        AppRedesSociales miApp = new AppRedesSociales();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cual red quiere conectarse?");
        System.out.println("1. Tiktok  -  2.Instragram  -  3.Facebook");
        int opcion = entrada.nextInt();
        
        if (opcion == 1){
            miApp.setEstrategia(new Tiktok());
        } else if (opcion == 2){
            miApp.setEstrategia(new Instagram());
        } else if (opcion == 3){
            miApp.setEstrategia(new Facebook());
        }

        miApp.ejecutarConexion();
    }
}
