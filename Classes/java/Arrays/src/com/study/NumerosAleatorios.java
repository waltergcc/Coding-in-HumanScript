package com.study;

import java.util.Random;

public class NumerosAleatorios {

    public static void receberNumeros(){

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(100);
            System.out.println(numerosAleatorios[i]);
        }
    }
}
