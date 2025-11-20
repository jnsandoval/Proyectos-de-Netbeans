/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.listadirectorios;

import java.io.File;

/**
 *
 * @author labesp
 */
public class ListaDirectorios {

    public static void main(String[] args) {
        File dir = new File("C://ClaseFile");
        listaRecursiva(dir);
    }
    
    public static void listaRecursiva(File dir){
        if(dir.isDirectory()){
            File[] items = dir.listFiles();
            for(File item: items){
                System.out.println(item.getAbsoluteFile());
                if(item.isDirectory()){
                    listaRecursiva(item);
                }
            }
        }
    }
}
