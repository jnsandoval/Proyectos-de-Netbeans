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
    private String id; // Mejor usar String para el ID de MongoDB (ObjectId)
    private String Nombre;
    private String Apellido;
    private String Email;
    private int Edad;
    private String Carrera;

    // Constructor vacío (útil para ciertas operaciones)
    public Estudiante() {
    }

    // Constructor completo
    public Estudiante(String id, String Nombre, String Apellido, String Email, int Edad, String Carrera) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Edad = Edad;
        this.Carrera = Carrera;
    }

    // --- Getters y Setters Completos ---

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    
    // (Los demás getters y setters ya los tenías, los mantengo)
    
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

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Email=" + Email + ", Edad=" + Edad + ", Carrera=" + Carrera + '}';
    }
}