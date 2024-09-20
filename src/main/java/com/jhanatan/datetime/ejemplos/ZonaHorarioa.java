package com.jhanatan.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonaHorarioa {

    public static void main(String[] args) {
        ejemplo01();
    }

    public static void ejemplo01() {
        LocalDateTime fechaLocal = LocalDateTime.now();
        System.out.println("Fecha Local: " + fechaLocal);

        //creamos una zona horaria
        ZoneId newYork = ZoneId.of("America/New_York");

        //creamos un tiempo con zona
        ZonedDateTime zdt = ZonedDateTime.of(fechaLocal, newYork);
        System.out.println("Zona Horaria de New York: " + zdt);

        //creamos una zona horaria diferente
        ZoneId madrid = ZoneId.of("Europe/Madrid");
        //creamos una zona horaria a partir de la zona de New_York en el mismo instante
        ZonedDateTime zonedMadrid = zdt.withZoneSameInstant(madrid);
        System.out.println("Zona horaria de Madrid: " + zonedMadrid);
    }

    public static void ejemplo02Viajar() {
        LocalDateTime fechaLocal = LocalDateTime.now();
        System.out.println("Fecha Local: " + fechaLocal);

        //creamos una zona horaria
        ZoneId newYork = ZoneId.of("America/New_York");

        //creamos un tiempo con zona
        ZonedDateTime zdt = ZonedDateTime.of(fechaLocal, newYork);
        System.out.println("Hora Partida en New_York: " + zdt);

        //creamos una zona horaria diferente
        ZoneId madrid = ZoneId.of("Europe/Madrid");
        //creamos una zona horaria a partir de la zona de New_York en el mismo instante
        ZonedDateTime zonedMadrid = zdt.withZoneSameInstant(madrid).plusHours(8);
        System.out.println("Hora LLegada en Madrid: " + zonedMadrid);
    }

}
