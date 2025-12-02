/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.metodoestatico;

/**
 *
 * @author labesp
 */
public class MetodoEstatico {

    // Metodo estatico publico para calcular
    // el cuadrado de un numero
    
    public static int cuadrado(int num){
        return num * num;
    }
    
    
    
    public static void main(String[] args) {
    
    // Llamando al metodo estatico directamente
    // utilizando el nombre de la clase
    
    // CORRECCIÓN: Se elimina el nombre de clase incorrecto
    // y se usa el operador de asignación (=)
    
    int resultado = MetodoEstatico.cuadrado(5); 
    
    System.out.println(resultado);
    // Salida: 25
    }
}