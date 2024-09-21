package com.jhanatan.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploCambiarFecha {

    public static void main(String[] args) {
        System.out.println("EJEMPLO PERIDO");
        ejempl01();
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
}
