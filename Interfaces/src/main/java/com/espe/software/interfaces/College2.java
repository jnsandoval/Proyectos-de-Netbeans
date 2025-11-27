/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.interfaces;

/**
 *
 * @author labesp
 */
public class College2 implements University{
    
    //Must Implemente abstract methods
    
    @Override
    public void courses(){
        System.out.println("A, E, I");
    }
    
    @Override
    public void sports(){
        System.out.println("Basquetball");
    }
}

