/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionestudiantes.modelo;

/**
 *
 * @author DELL
 */

public class Estudiante {

    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    private String carrera;

    public Estudiante(int id, String nombre, String apellido, String email, int edad, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
        this.carrera = carrera;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

   
}
