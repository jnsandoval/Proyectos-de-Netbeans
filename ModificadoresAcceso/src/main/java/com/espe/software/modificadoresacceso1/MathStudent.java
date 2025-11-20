/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.modificadoresacceso1;

/**
 *
 * @author labesp
 */

import com.espe.software.modificadoresacceso.Student;

public class MathStudent {
     
    public void getStudent(){
        Student student = new Student("Happy", "Delhi", 39);
        
        System.out.println(student.getName());
        System.out.println(student.getCity());
        System.out.println(student.getAge());
    }
}
