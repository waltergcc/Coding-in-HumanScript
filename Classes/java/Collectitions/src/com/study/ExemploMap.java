package com.study;

import java.util.*;

public class ExemploMap {



    public static void chamarMap(){

        Map<String, Double>  carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.4);
            put("Siena", 12d);
            put("Kombi", 5.5);
            put("Fiesta", 13.4);
        }};

        System.out.println("Carros populares:\n" + carrosPopulares);

        carrosPopulares.put("Gol",14d);
        System.out.println("Lista atualizada\n" + carrosPopulares);

        System.out.println("Qual o consumo do Uno? " + carrosPopulares.get("Uno"));

        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("Quais os modelos?\n" + modelos);

        Collection<Double> consumos = carrosPopulares.values();
        System.out.println("Quais os consumos? \n" + consumos);

        Double consomeMais = Collections.max(carrosPopulares.values());
        System.out.println("Quem consome mais? " + consomeMais
        );



    }
}
