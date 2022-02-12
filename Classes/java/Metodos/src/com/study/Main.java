package com.study;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercícios da calculadora");
        Calculadora.soma(30,15);
        Calculadora.subtracao(30,15);
        Calculadora.multiplicacao(30,15);
        Calculadora.divisao(30,15);

        System.out.println("\nExercícios da Saudação");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(18);
    }
}
