package com.jhanatan.datetime.ejemplos;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {

    public static void main(String[] args) {
        System.out.println("EJEMPLO LOCAL TIME");

        LocalTime aAhora = LocalTime.now();
        System.out.println(aAhora);
        System.out.println("Hora: " + aAhora.getHour());
        System.out.println("Minutos: " + aAhora.getMinute());
        System.out.println("Seg: " + aAhora.getSecond());

        System.out.println("");

        LocalTime onceDiecisiete = LocalTime.of(11, 17);
        System.out.println("Hora: " + onceDiecisiete);

        //establecemos la hora
        onceDiecisiete = LocalTime.parse("11:57");
        System.out.println(onceDiecisiete);

        //sumando a la hora
        LocalTime seisDoce = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
        System.out.println(seisDoce);

        //para ver si una hora es anteior a la otra
        boolean esAnterior = LocalTime.of(6, 12).isBefore(LocalTime.parse("07:30"));
        System.out.println("Es anterior: " + esAnterior);
    }

}
