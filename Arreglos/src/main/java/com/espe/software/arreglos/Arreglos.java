/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.arreglos;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author labesp
 */
public class Arreglos {

    public static void main(String[] args) {
        //Declaracion
        double[] myDoubleArray = new double [3];
        myDoubleArray[0]= 5.0;
        myDoubleArray[1]= 4.1;
        myDoubleArray[2]= 3.9;
        
        
        //Acceso a los elementos a travez del indice
        
        for (int i=0; i<1; i++){
            System.out.println(myDoubleArray[0]);
            System.out.println(myDoubleArray[1]);
            System.out.println(myDoubleArray[2]);
        }
        
        
        
        
        
        
        
        ////////
        //Inicializacion en una linea
        
        int[] primos = {2,3,5,7,11,13,17,19};
        for (int i=0; i < primos.length; i++){
            System.out.println(primos[i]);
        }
        
        //
        for (int prim : primos) {
            System.out.println(prim);
        }
        
        
        ////////
        //Arreglo de cadenas
        
        String[] lenguajes = {"Java", "C++", "Python"};
        for (int i=0; i < lenguajes.length; i++){
            System.out.println(lenguajes[i]);
        }
        
        //
        
        for (String leng : lenguajes) {
            System.out.println(leng);
        }
        
        
        
        
        
        
        
        //Arreglo objetos
        
        Cliente[] clientes = {new Cliente("Steeven"), new Cliente("Richy"), new Cliente ("Eddy")};
        for (int i=0; i < clientes.length; i++){
            System.out.println(clientes[i].getNombre());
        }
        
        //
        
        for (Cliente cli : clientes){
            System.out.println("Nombre cliente : " + cli.getNombre());
        }
        
        
        
        //Valores por defecto
        
        int[] notas = new int[5];
        for(int n : notas){
            System.out.println(n);
        }
        
        //Copia de Arrays
        
        int [] a = {1,8,3};
        int [] b = new int [a.length];
        b=a;
        b[0] = 9;
        a[2] = 5;
        
        System.out.println(a[0]);
        System.out.println(b[2]);
        
        //Clonación de arrays
        
        int [] c = {1,8,3};
        int[] d = c.clone();
        System.out.println(c==d);
        System.out.println(Arrays.equals(c,d));
        d[0] = 9;
        c[2] = 5;
        
        System.out.println(c[0]);
        System.out.println(d[0]);
        System.out.println(c[2]);
        System.out.println(d[2]);
        
        //Array de Arrays
        int [][] tabla = new int [3][2];
        int cont = 1;
        for (int i=0; i<tabla.length; i++){
            for (int j=0; j<tabla[i].length; j++){
                tabla[i][j] = cont++;
            }
        }
        
        for (int i=0; i<tabla.length; i++){
            for (int j=0; j<tabla[i].length; j++){
                System.out.println (tabla [i][j]);
            }
        }
        
        int [][] tabla2 = {
            {1,2},
            {3,4},
            {5,6}
        };
        
        System.out.println(Arrays.deepEquals(tabla, tabla2));
        
        //Ejercicio ArrayList
        System.out.println("Ejemplo ArrayList");
        ArrayList<Integer> scores = new ArrayList<Integer> ();
        scores.add(23);
        scores.add(15);
        scores.add(0);
        System.out.println("El tamaño del array es de: " + scores.size());
        for (int e : scores){
            System.out.println(e);
        }
        
        scores.remove(1);
        System.out.println("El tamaño del array es de: " + scores.size());
        for (int e : scores){
            System.out.println(e);
        }
        
        
        //Ejemplo 2 arrayList
        ArrayList<Cliente> clientes1 = new ArrayList<Cliente> ();
        clientes1.add(new Cliente("Carlos"));
        clientes1.add(new Cliente("Mary"));
        clientes1.add(new Cliente("Juan"));
        System.out.println("El tamaño del array es de: " + clientes1.size());
        for (Cliente cli : clientes1){
            System.out.println(cli);
        }
        
    }
}


