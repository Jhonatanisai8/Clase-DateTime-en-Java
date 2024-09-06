package com.jhanatan.datetime.ejemplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Clase29DateTime {

    public static void main(String[] args) {
        System.out.println("\tApi Fecha Actual");
        ejemplo01();

    }

    public static void ejemplo01() {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        System.out.println("Dia: " + fechaActual.getDayOfMonth());
        System.out.println("Mes: " + fechaActual.getMonth());
        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Dia del año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());

        //otra forma de establecer una fecha
        fechaActual = LocalDate.of(2024, 3, 23);
        System.out.println("Fecha Establecida: " + fechaActual);

        //otra forma de establecer la fecha
        fechaActual = LocalDate.of(2024, Month.MARCH, 12);
        System.out.println("Fecha Establecida 02: " + fechaActual);

        //otra forma 
        fechaActual = LocalDate.parse("2024-12-03");
        System.out.println("Fecha actual 03: " + fechaActual);

        //obtenemos el dia de siguiente
        LocalDate diaMañana = LocalDate.now().plusDays(1);
        System.out.println("Dia de mañana: " + diaMañana);

        //obtenemos el mes anterior al mismo dia 
        LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
        System.out.println("Mes anteior Mismo dia: " + mesAnteriorMismoDia);

        //obtenemos el mes anterior al mismo dia 
        LocalDate mesAnteiorMismodia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("Mes anterior mismo dia: " + mesAnteiorMismodia);

        //obtenemos el dia de la semana 
        DayOfWeek jueves = LocalDate.parse("2024-09-05").getDayOfWeek();
        System.out.println("Dia de la semana de la fecha 2024-09-05: " + jueves);

        //obtenemos el dia del mes
        int mes = LocalDate.of(2024, 9, 5).getDayOfMonth();
        System.out.println("Mes de la fecha (2024, 9, 5): " + mes);

        //para saber si un año es bisiesto
        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("¿Este año 2024 es bisiesto? : " + esBisiesto);

        //para comparar fechas 
        //antes
        boolean esAntes = LocalDate.of(2024, 9, 5).isBefore(LocalDate.parse("2023-09-04"));
        System.out.println("Es antes?: " + esAntes);

        //despues
        boolean esDespues = LocalDate.parse("2020-11-11").isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("Es despues?: " + esDespues);

        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("es despues?: " + esDespues);

    }

}
