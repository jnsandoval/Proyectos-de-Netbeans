/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.maincomposite.modelamiento;

/**
 *
 * @author labesp
 */
public abstract class Empleado {
    
    protected String nombre;
    protected int codigo;
    
    public Empleado (String nombre, int codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public abstract void realizarActividad(String prefijo);
    public abstract void ObtenerSubalternos();
    
}