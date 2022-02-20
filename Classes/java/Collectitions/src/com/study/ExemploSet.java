package com.study;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

    public static void chamarSet(){

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 5d, 9d, 3d, 5d, 3d, 8d, 4d));
        System.out.println("Notas usando Set:\n" + notas.toString());

        System.out.println("Tem a mota 5? " + notas.contains(5d));

        System.out.println("Qual a menor nota? " + Collections.min(notas));
        System.out.println("Qual a maior nota? " + Collections.max(notas));
    }
}
