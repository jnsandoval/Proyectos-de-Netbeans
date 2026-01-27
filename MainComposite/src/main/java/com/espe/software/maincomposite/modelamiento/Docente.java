/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.maincomposite.modelamiento;

/**
 *
 * @author labesp
 */
public class Docente extends Empleado {

    public Docente(String nombre, int codigo) {
        super(nombre, codigo);
    }

    @Override
    public void realizarActividad(String prefijo) {
        System.out.println(prefijo + "- Docente " + nombre + " da clases");
    }

    @Override
    public void ObtenerSubalternos() {
        System.out.println(nombre + " no tiene subalternos");
    }

}