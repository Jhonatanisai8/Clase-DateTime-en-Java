/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jhanatan.datetime.ejemplos;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author User
 */
public class EjemploDuration02 {

    public static void main(String[] args) {
        System.out.println("EJEMPLO INSTANT");
        ejemplo01();
    }

    public static void ejemplo01() {

        //creamos un instante
        Instant instant01 = Instant.now();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            System.out.println("ocurrio un error: " + e.getMessage());
        }
        System.out.println("Instante 01: " + instant01);
        Instant instant02 = Instant.now();
        System.out.println("Instante 02: " + instant02);

        System.out.println("");

        //calculamos la duracion 
        Duration duration = Duration.between(instant01, instant02);
        System.out.println("TIEMPO: " + duration);
    }
}
