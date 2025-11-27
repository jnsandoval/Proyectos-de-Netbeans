/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.claseabstracta;

/**
 *
 * @author labesp
 */

public class College extends University {

    // Must implement the abstract method of the parent class
    @Override
    public void sports(){ 
        // Must be public because the abstract method in University is public
        System.out.println("Football");
    }
}