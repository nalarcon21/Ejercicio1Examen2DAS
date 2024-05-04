/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1examen;

import java.util.List;

/**
 *
 * @author nalar
 */
public class Ejercicio1Examen {

    public static void main(String[] args) {
        
        //Obtenemos la instancia de Logger
        Logger logger = Logger.getInstance();

        // creamos eventos y los registramos
        Event runningEvent = EventFactory.createEvent("running", "Distance: 5km, Time: 30 minutes");
        Event cyclingEvent = EventFactory.createEvent("cycling", "Distance: 10km, Time: 1 hour");

        logger.logEvent("Starting event logging...");
        runningEvent.display();
        cyclingEvent.display();

        // Obtenemos lo registros
        List<String> logs = logger.getLogs();
        System.out.println("Logs:");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
