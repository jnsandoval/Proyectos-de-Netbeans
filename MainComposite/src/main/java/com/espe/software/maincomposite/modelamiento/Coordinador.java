/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.maincomposite.modelamiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labesp
 */
public class Coordinador extends Empleado {

    private List<Empleado> listaSubalternos = new ArrayList<>();

    public void agregar(Empleado e) {
        listaSubalternos.add(e);
    }

    public Coordinador(String nombre, int codigo) {
        super(nombre, codigo);
    }


    @Override
    public void realizarActividad(String prefijo) {
    System.out.println(prefijo + "Coordinador " + nombre + " ejecuta actividad 3");
    
    if (!listaSubalternos.isEmpty()) {
        System.out.println(prefijo + "  Subalternos de " + nombre + ":");
        for (Empleado e : listaSubalternos) {
            e.realizarActividad(prefijo + "    ");
        }
    }
}

    @Override
    public void ObtenerSubalternos() {
        for (Empleado e : listaSubalternos) {
            System.out.println("Subalterno de " + this.nombre + ": " + e.nombre);
        }
    }

}
