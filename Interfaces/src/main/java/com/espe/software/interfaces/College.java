/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.interfaces;

/**
 *
 * @author labesp
 */
public class College implements University{
    
    //Must Implemente abstract methods
    
    @Override
    public void courses(){
        System.out.println("P, C, M");
    }
    
    @Override
    public void sports(){
        System.out.println("Football");
    }
}
