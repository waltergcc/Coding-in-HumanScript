package com.study;

import java.util.Random;

public class Matriz {

    public static void receberMatriz(){

        Random random = new Random();
        int [][] M = new int [4][4];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length ; j++) {
                M[i][j] = random.nextInt(9);
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }
    }
}