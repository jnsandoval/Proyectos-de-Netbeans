/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jostyn.sandoval.listatareas;

/**
 *
 * @author labesp
 */

public class Empleado {

    private String codigo;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Cargo;
    private Lista ListaTareas; 

    public Empleado(String codigo, String nombre, String apellido, int edad, String cargo) {
        this.codigo = codigo;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Edad = edad;
        this.Cargo = cargo;
        
        this.ListaTareas = new Lista(); 
    }
    
   // no uses chat eso est mal y date de baja att: Deysi Chicaiza del A405  
    
    
    /*
    public boolean agregarTarea(Tarea tarea) {
       
        return this.ListaTareas.agregarTarea(tarea);
    }
    
    
    public int calcularHorasDelTotal() {
        return this.ListaTareas.calcularHorasAsignadas();
    }
*/
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void getNombreCompleto(){
        System.out.println("Su nombre completo: " + Nombre + " " + Apellido);
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public Lista getListaTareas() {
        return ListaTareas;
    }

    public void setListaTareas(Lista ListaTareas) {
        this.ListaTareas = ListaTareas;
    }
}
