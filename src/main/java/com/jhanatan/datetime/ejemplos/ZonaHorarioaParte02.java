package com.jhanatan.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonaHorarioaParte02 {

    public static void main(String[] args) {
        ejemplo04();
    }

    public static void ejemplo01() {
        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/23 12:45",
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
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

        //damos formato a la fecha 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Detalle del viaje a España: ");
        System.out.println("Partida NY: " + formatter.format(zdt));
        System.out.println("LLegada a Madrid: " + formatter.format(zonedMadrid));
    }

    public static void ejemplo02() {
        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/23 12:45",
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        System.out.println("Fecha Local: " + fechaLocal);

        //creamos un tiempo con zona
        ZonedDateTime zdt = ZonedDateTime.of(fechaLocal, ZoneId.of("-04:00"));
        System.out.println("Zona Horaria de New York: " + zdt);

        //creamos una zona horaria a partir de la zona de New_York en el mismo instante
        ZonedDateTime zonedMadrid = zdt.withZoneSameInstant(ZoneId.of("+02:00"));
        System.out.println("Zona horaria de Madrid: " + zonedMadrid);

        //damos formato a la fecha 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Detalle del viaje a España: ");
        System.out.println("Partida NY: " + formatter.format(zdt));
        System.out.println("LLegada a Madrid: " + formatter.format(zonedMadrid));
    }

    public static void ejemplo03() {
        System.out.println("Listas de Zonas");
        //traemos todas las xonas disponibles
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }

    public static void ejemplo04() {
        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/23 12:45",
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        System.out.println("Fecha Local: " + fechaLocal);
        ZoneId newYork = ZoneId.of("America/New_York");
        
        //creamos una zona a partir de una zonaHoraria
        ZonedDateTime zoneNY = fechaLocal.atZone(newYork);
        System.out.println("Zona Horaria de New York: " + zoneNY);

        //creamos una zona horaria a partir de la zona de New_York en el mismo instante
        ZonedDateTime zonedMadrid = zoneNY.withZoneSameInstant(ZoneId.of("+02:00")).plusHours(8);
        System.out.println("Zona horaria de Madrid: " + zonedMadrid);

        //damos formato a la fecha 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Detalle del viaje a España: ");
        System.out.println("Partida NY: " + formatter.format(zoneNY));
        System.out.println("LLegada a Madrid: " + formatter.format(zonedMadrid));
    }

}
