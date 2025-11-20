/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jostyn.sandoval.listatareas;

/**
 *
 * @author labesp
 */
public class Tarea {
    private String Codigo;
    private String Nombre;
    private String Descripcion;
    private String FechaAsignada;
    private String DuracionHoras;
    
    public Tarea (String Codigo, String Nombre, String Descripcion, String FechaAsignada, String DuracionHoras){
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.FechaAsignada = FechaAsignada;
        this.DuracionHoras = DuracionHoras;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFechaAsignada() {
        return FechaAsignada;
    }

    public void setFechaAsignada(String FechaAsignada) {
        this.FechaAsignada = FechaAsignada;
    }

    public String getDuracionHoras() {
        return DuracionHoras;
    }

    public void setDuracionHoras(String DuracionHoras) {
        this.DuracionHoras = DuracionHoras;
    }

    int getDuracionEnHoras() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

