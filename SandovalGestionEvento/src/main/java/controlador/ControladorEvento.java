/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;



/**
 *
 * @author labesp
 */

import java.util.ArrayList;
import modelo.Evento;

public class ControladorEvento implements IControlador{
    
    private ArrayList<Evento> lista = new ArrayList<>();
    
    @Override
    public void agregarEvento(Evento ev){
        lista.add(ev);
    }
    
    @Override
    public void listarEventos(){
        for(Evento e: lista){
            System.out.println("ID: " + e.getID() + ", " + "Nombre: " + e.getNombre() + ", " + "Fecha: "+ e.getFecha() + ", " + "Lugar: " + e.getLugar() + ", " + "Descripcion: " + e.getDescripcion() + " ." );
        }
    }
    
    public ArrayList<Evento> getLista(){
        return lista;
    }
}
