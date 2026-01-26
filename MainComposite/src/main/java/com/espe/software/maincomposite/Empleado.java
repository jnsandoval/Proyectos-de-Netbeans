/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.maincomposite;

/**
 *
 * @author labesp
 */
public abstract class Empleado {
    
    protected String nombre;
    protected String codigo;
    
    public Empleado (String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public abstract void obtenerSubalternos();
    public abstract void realizarActividad();
}
