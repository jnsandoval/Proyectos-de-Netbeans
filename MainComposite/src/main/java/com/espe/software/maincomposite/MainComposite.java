/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.maincomposite;

import com.espe.software.maincomposite.modelamiento.Coordinador;
import com.espe.software.maincomposite.modelamiento.DirectorCarrera;
import com.espe.software.maincomposite.modelamiento.Docente;
import com.espe.software.maincomposite.modelamiento.Estudiante;

/**
 *
 * @author labesp
 */
public class MainComposite {

    public static void main(String[] args) {
        Docente profesor = new Docente("Ing Quina", 1001);
        Estudiante estu1 = new Estudiante("Ana", 2001);
        
        Coordinador coord1 = new Coordinador("Ing Agurio", 3001);
        DirectorCarrera dirC = new DirectorCarrera("Mgs Garcia", 4001);
        
        coord1.agregar(profesor);
        dirC.agregar(coord1);
        dirC.agregar(estu1);
        
        System.out.println("Estructura Organizacional");
        dirC.realizarActividad(""); 
    }
}