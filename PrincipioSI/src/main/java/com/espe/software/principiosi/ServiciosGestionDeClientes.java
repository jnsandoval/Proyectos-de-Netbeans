/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.espe.software.principiosi;

/**
 *
 * @author labesp
 */
public interface ServiciosGestionDeClientes {
        
    public int crearCliente(String nombre, String direccion);
    public void desabiliarCliente(int idCliente);
    
}
