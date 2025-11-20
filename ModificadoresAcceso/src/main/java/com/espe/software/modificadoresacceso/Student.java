/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espe.software.modificadoresacceso;

/**
 *
 * @author labesp
 */
public class Student {
    
    
    private String name = "Happy";
    
    private String city = "Delhi";
    
    private int age=39;

    public Student(String name, String city, int age) {
        this.name= name;
        this.city= city;
        this.age= age;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}
