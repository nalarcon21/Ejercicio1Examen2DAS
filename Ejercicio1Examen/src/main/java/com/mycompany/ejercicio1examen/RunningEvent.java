package com.mycompany.ejercicio1examen;


import com.mycompany.ejercicio1examen.Event;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nalar
 */
public class RunningEvent implements Event {
    private String data;

    public RunningEvent(String data) {
        this.data = data;
    }

    public void display() {
        System.out.println("Running event: " + data);
    }
}

