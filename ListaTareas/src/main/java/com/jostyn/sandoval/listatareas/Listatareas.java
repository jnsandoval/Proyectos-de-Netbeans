/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jostyn.sandoval.listatareas;

import java.time.LocalDate;

/**
 *
 * @author labesp
 */

public class Listatareas {

    private Lista<Tarea> tareas;
    private static final int LIMITE_HORAS = 40;
    private Iterable<Tarea> Tareas;

    public boolean agregarTarea(Tarea tarea) {
        int totalActual = calcularHorasAsignadas();
        if (totalActual + tarea.getDuracionEnHoras() <= LIMITE_HORAS) {
            this.tareas.add(tarea);
            return true;
        } else {
            return false;
        }
    }

    public int calcularHorasAsignadas() {
        int totalHoras = 0;
        for (Tarea tarea : Tareas) {
            totalHoras += tarea.getDuracionEnHoras();
        }
        return totalHoras;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }
 
}                                                                                                                                                                                   
    