package com.study;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercicio de Sobrecarga:");
        Quadrilatero.area(5);
        Quadrilatero.area(5d, 8d);
        Quadrilatero.area(5, 6, 7);
        Quadrilatero.area(6f, 6f);

        System.out.println("\nExercicio de Sobrecarga com retorno:");
        double areaQuadrado = QuadrilateroComRetorno.area(5);
        double areaRetangulo = QuadrilateroComRetorno.area(5d, 8d);
        double areaTrapezio = QuadrilateroComRetorno.area(5, 6, 7);

        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do retângulo: " + areaRetangulo);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
}
