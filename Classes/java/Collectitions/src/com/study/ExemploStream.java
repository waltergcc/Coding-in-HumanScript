package com.study;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExemploStream {

    public static void chamarStream(){

        List<String> numerosAleatorios = Arrays.asList("1","2","55","68","890","125","78","45","37","7","13","246","789");

        System.out.println("\nExibir números:\n");
        numerosAleatorios.forEach(System.out::println); //Imprime todos os valores da lista

        List<Integer> numerosInteiros = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .toList();

        System.out.println("\nExibir primeiros 5 números:\n");
        numerosAleatorios // Imprime os 5 primeiros valores da lista
                .stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("\nConverter String em números:\n");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .toList()
                .forEach(System.out::println);

        System.out.println("\nExibir números pares maiores que 100:\n");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 60)
                .toList()
                .forEach(System.out::println);

        System.out.println("\nMostrar a média dos números:\n");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\nRemover números pares:\n");
        numerosInteiros.stream()
                .filter(i -> i % 2 != 0)
                .toList()
                .forEach(System.out::println);

    }
}
