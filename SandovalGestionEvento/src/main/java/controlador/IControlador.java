/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author labesp
 */

import modelo.Evento;

public interface IControlador {
    
    void agregarEvento(Evento ev);
    void listarEventos();
}
