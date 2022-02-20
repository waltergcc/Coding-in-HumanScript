package com.study;

import java.util.Scanner;

public class UncheckedException {

    public static void chamarUnchecked() {

        boolean verificador = true;

        do{
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Digite o numerador:");
                String numerador = scan.next();
                System.out.println("Digite o denominador:");
                String denominador = scan.next();

                int resultado = dividir(Integer.parseInt(numerador), Integer.parseInt(denominador));
                System.out.println("Resultado: " + resultado);
                verificador = false;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Só são aceito números inteiros");
            } catch (ArithmeticException e){
                System.out.println("Não dá para dividir um número por zero.");
            } finally {
                System.out.println("Sempre imprime o finally");
            }

        } while (verificador);

        System.out.println("O código continua...");
    }

    public static int dividir(int numerador, int denominador){
        return numerador / denominador;
    }

}
