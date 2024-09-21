package com.jhanatan.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {

    public static void main(String[] args) {
        System.out.println("EJEMPLO PERIDO");
        ejempl01();
    }

    public static void ejempl01() {
        LocalDate fecha01 = LocalDate.of(2006, 2,8);
        LocalDate fecha02 = LocalDate.of(2024, 9, 21);

        //perido 
        Period period01 = Period.between(fecha01, fecha02);
        System.out.println("Periodo entre fecha 1 y 2: " + period01);

        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d dias",
                fecha01, fecha02, period01.getYears(), period01.getMonths(), period01.getDays());
    }
}
