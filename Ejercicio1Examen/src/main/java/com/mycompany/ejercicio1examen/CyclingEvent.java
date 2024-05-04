package com.mycompany.ejercicio1examen;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nalar
 */
public class CyclingEvent implements Event {
    private String data;

    public CyclingEvent(String data) {
        this.data = data;
    }

    public void display() {
        System.out.println("Cycling event: " + data);
    }
}

