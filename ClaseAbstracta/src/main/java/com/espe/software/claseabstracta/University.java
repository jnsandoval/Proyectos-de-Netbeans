/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.claseabstracta;

/**
 *
 * @author labesp
 */

public abstract class University {

    // Concrete method
    public void curses(){ // Public is generally better practice
        System.out.println("P, C, M");
    }

    // Abstract method - NO BODY
    public abstract void sports(); 

}