/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.espe.software.testfileclass;

/**
 *
 * @author labesp
 */
public class TestFileClass {

    public static void main(String[] args) {
        java.io.File file = new java.io.File("imagen/us.gif");
        System.out.println("¿Existe?" + file.exists());
        System.out.println("El archivo tiene" + file.length() + "bytes");
        System.out.println("¿Se puede leer?" + file.canRead());
        System.out.println("¿Se puede escribir?" + file.canWrite());
        System.out.println("¿Es un directorio?" + file.isDirectory());
        System.out.println("¿Es un archivo?" + file.isFile());
        System.out.println("¿Es absoluto?" + file.isAbsolute());
        System.out.println("¿Esta oculto?" + file.isHidden());
        System.out.println("La ruta absoluta es" + file.getAbsolutePath());
        System.out.println("Modificado por ultima vez el" + new java.util.Date(file.lastModified()));  
    }
}
