package com.mycompany.ejercicio1examen;


import com.mycompany.ejercicio1examen.Event;
import com.mycompany.ejercicio1examen.CyclingEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nalar
 */
public class EventFactory {
    public static Event createEvent(String type, String data) {
        switch (type) {
            case "running":
                return new RunningEvent(data);
            case "cycling":
                return new CyclingEvent(data);
            default:
                throw new IllegalArgumentException("Unsupported event type");
        }
    }
}

