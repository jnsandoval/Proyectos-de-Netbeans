/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.claseabstracta;

/**
 *
 * @author labesp
 */

public class ClaseAbstracta {

    public static void main(String[] args) {
        
        // Objeto de College
        University myCollege1 = new College(); 
        myCollege1.curses();
        myCollege1.sports(); // Output: Football
        
        System.out.println("---");
        
        // Objeto de College2
        University myCollege2 = new College2(); 
        myCollege2.curses();
        myCollege2.sports(); // Output: Basquetball
    }
}
