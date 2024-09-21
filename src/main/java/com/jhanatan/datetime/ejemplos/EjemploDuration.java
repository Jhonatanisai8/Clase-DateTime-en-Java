package com.jhanatan.datetime.ejemplos;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjemploDuration {

    public static void main(String[] args) {
        ejemplo01();
    }

    public static void ejemplo01() {
        //creamos una fecha 
        LocalDateTime fecha01 = LocalDateTime.now();
        //a la segunda fecha le agregamos tiempo
        LocalDateTime fecha02 = LocalDateTime.now().plusHours(2).plusMinutes(45).plusDays(4);

        //calculamos el tiempo transcurrido 
        Duration lapsus = Duration.between(fecha01, fecha02);
        System.out.println("Lapsus entre fecha 01 y 02: " + lapsus);

        //extraemos los segundos,minutos, dias ect en el determinado tiempo 
        System.out.println("Minutos: " + lapsus.toMinutes());
        System.out.println("Segundos : " + lapsus.getSeconds());
        System.out.println("Dias: " + lapsus.toDays());
        System.out.println("Horas: " + lapsus.toHours());
        System.out.println("Horas despues de 5: "+lapsus.plusHours(5));

    }

}
