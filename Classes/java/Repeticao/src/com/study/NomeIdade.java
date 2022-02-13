package com.study;

import java.util.Scanner;

public class NomeIdade {

    public static void receberNomes() {

        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }


    }

}
