package com.jhanatan.datetime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploFormatearHora {

    public static void main(String[] args) {
        System.out.println("EJEMPLO LOCAL TIME");

        //cremos la hora 
        LocalTime aAhora = LocalTime.now();

        System.out.println(aAhora);
        System.out.println("Hora: " + aAhora.getHour());
        System.out.println("Minutos: " + aAhora.getMinute());
        System.out.println("Seg: " + aAhora.getSecond());

        System.out.println("");

        //otra forma de crear una hora con segundos
        LocalTime onceDiecisiete = LocalTime.of(11, 17, 50);
        System.out.println("Hora: " + onceDiecisiete);

        //establecemos la hora
        onceDiecisiete = LocalTime.parse("11:57");
        System.out.println(onceDiecisiete);

        //sumando a la hora
        LocalTime seisDoce = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
        System.out.println("Nueva Hora: " + seisDoce);

        //para ver si una hora es anteior a la otra con segundos
        boolean esAnterior = LocalTime.of(6, 12, 50).isBefore(LocalTime.parse("07:30"));
        System.out.println("Es anterior: " + esAnterior);

        //le damos formato a la hora
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String hora = df.format(onceDiecisiete);
        String hora2 = onceDiecisiete.format(df);

        System.out.println("Hora formateada: " + hora2);
        System.out.println("Hora formateada: " + hora);

        System.out.println("");
        //hora maxima y minima
        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);

    }

}
