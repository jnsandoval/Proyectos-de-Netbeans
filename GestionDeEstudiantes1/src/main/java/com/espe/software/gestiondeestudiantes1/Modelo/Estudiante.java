/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.gestiondeestudiantes1.Modelo;

/**
 *
 * @author labesp
 */
public class Estudiante {
    private int id;
    private String Nombre;
    private String Apellido;
    private String Email;
    private int Edad;
    private String Carrera;

    public Estudiante(int id, String Nombre, String Apellido, String Email, int Edad, String Carrera) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Edad = Edad;
        this.Carrera = Carrera;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
}
