/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.maincomposite.modelamiento;

/**
 *
 * @author labesp
 */
public class Estudiante extends Empleado {

    public Estudiante(String nombre, int codigo) {
        super(nombre, codigo);
    }

    @Override
    public void realizarActividad(String prefijo) {
        System.out.println(prefijo + "- Estudiante " + nombre + " estudia");
    }

    @Override
    public void ObtenerSubalternos() {
        System.out.println(nombre + " no tiene subalternos");
    }
        
}