package com.jhanatan.datetime.ejemplos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class EjemploCambiarFecha {

    public static void main(String[] args) {
        System.out.println("EJEMPLO PERIDO");
        ejemplo02();
    }

    public static void ejempl01() {
        LocalDate fecha01 = LocalDate.of(2011, 9, 8);
        LocalDate fecha02 = LocalDate.of(2020, 11, 21);
        //creamos un tercera fecha auxiliar 
        //cambiamos el mes en este caso 
        //los metodos son immutables
        LocalDate fecha03 = fecha02.withMonth(12);
        //cambiamos el dia 
        fecha03 = fecha03.withDayOfMonth(28);

        //perido 
        Period period01 = Period.between(fecha01, fecha03);
        System.out.println("Periodo entre fecha 1 y 2: " + period01);

        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d dias",
                fecha01, fecha03, period01.getYears(), period01.getMonths(), period01.getDays());
    }

    public static void ejemplo02() {
        //creamos una fecha 
        LocalDateTime fecha01 = LocalDateTime.now();
        //le establecemos una hora
        fecha01 = fecha01.withHour(12);
        //a la segunda fecha le agregamos tiempo
        LocalDateTime fecha02 = LocalDateTime.now().plusHours(3).plusMinutes(45).plusDays(4);

        //calculamos el tiempo transcurrido 
        Duration lapsus = Duration.between(fecha01, fecha02);
        System.out.println("Lapsus entre fecha 01 y 02: " + lapsus);

        //extraemos los segundos,minutos, dias ect en el determinado tiempo 
        System.out.println("Minutos: " + lapsus.toMinutes());
        System.out.println("Segundos : " + lapsus.getSeconds());
        System.out.println("Dias: " + lapsus.toDays());
        System.out.println("Horas: " + lapsus.toHours());
        System.out.println("Horas despues de 5: " + lapsus.plusHours(5));
    }
}
