package com.jhanatan.datetime.ejemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {

    public static void main(String[] args) {
        System.out.println("EJEMPLO LOCALDATETIME");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Fecha Tiempo: " + localDateTime);

        localDateTime = LocalDateTime.of(2024, Month.MARCH, 24, 3, 23);
        System.out.println("Fecha y Tiempo: " + localDateTime);

        //formato estandar 
        localDateTime = LocalDateTime.parse("2022-03-24T03:23");
        System.out.println("Fecha y tiempo: " + localDateTime);

        //le sumamos un dia mas 
        LocalDateTime fechao2 = localDateTime.plusDays(1).plusHours(3);
        System.out.println("Fecha y tiempo 02: " + fechao2);

        //le quitamos 4 horas
        System.out.println("Fecha y tiempo 03: " + fechao2.minusHours(4));

        //podemos obtener el mes, el año, el dia de la fecha fechao2
        Month mes = fechao2.getMonth();
        System.out.println("MES: " + mes);

        int dia = fechao2.getDayOfMonth();
        System.out.println("DIA: " + dia);

        int año = fechao2.getYear();
        System.out.println("AÑO: " + año);

        //dandole formato a la fecha y tiempo
        String formato01 = fechao2.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("FORMATO 01: " + formato01);

        String formato02 = fechao2.format(DateTimeFormatter.ISO_DATE);
        System.out.println("FORMATO 02: " + formato02);

        //formato con un patron personalizado
        String formato03 = fechao2.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println("FORMATO 03: " + formato03);

        DateTimeFormatter dfFormatter = DateTimeFormatter.ofPattern("yyyy/HH/dd hh:mm:ss a");
        String formato04 = fechao2.format(dfFormatter);
        System.out.println("FORMATO 04: "+formato04);
        
        
    }

}
