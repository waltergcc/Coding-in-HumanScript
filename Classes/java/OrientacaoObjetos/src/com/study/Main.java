package com.study;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Prata","Gol",55);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.valorTanqueCheio(5.99));
    }
}
