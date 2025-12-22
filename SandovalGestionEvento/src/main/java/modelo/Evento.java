/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author labesp
 */
public class Evento {
    
    private int id;
    private String nombre;
    private String fecha;
    private String lugar;
    private String descripcion;
    
    public Evento(int id, String nombre, String fecha, String lugar, String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.descripcion =descripcion;
    }
    
    public int getID() {return id;}
    public String getNombre() {return nombre;}
    public String getFecha() {return fecha;}
    public String getLugar() {return lugar;}
    public String getDescripcion() {return descripcion;}
    
}
