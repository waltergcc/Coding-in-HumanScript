package com.study;

public class OrdemInversa {

    public static void mostrarOrdem(){

        int[] vetor = {0, 5, 45, -5, 13};
        int count = 0;

        while(count < (vetor.length)) {
            int inverso = (vetor.length-1) - count;
            System.out.print(vetor[inverso] + " ");
            count++;
        }
    }
}
