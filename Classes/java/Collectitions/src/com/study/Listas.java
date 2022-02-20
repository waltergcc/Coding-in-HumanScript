package com.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Listas {

    public static void chamarLista(){

        System.out.println("Criar lista:");

        List<Double> notas = new ArrayList<>();

        notas.add(7d);
        notas.add(8d);
        notas.add(9d);
        notas.add(5d);
        notas.add(3d);
        notas.add(10d);
        notas.add(1d);

        System.out.println("Lista adicionada:\n" + notas.toString());

        System.out.println("A nota 5 está na posição de indice " + notas.indexOf(5d));

        notas.add(4,7.5);
        System.out.println("Lista atualizada:\n" + notas.toString());

        notas.set(notas.indexOf(5d),6d);
        System.out.println("Nota 5 alterada para 6:\n" + notas.toString());

        System.out.println("Tem a nota 2.5 na lista? " + notas.contains(5d));

        System.out.println("Qual a terceira nota adicionada? " + notas.get(2));

        System.out.println("Qual a menor nota? " + Collections.min(notas));

        System.out.println("Qual a maior nota? " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Qual a soma de todas as notas? " + soma);

        Double media = soma / notas.size();
        System.out.println("Qual a media das notas? " + media);

        notas.remove(9d);
        System.out.println("Lista sem a nota 9\n" + notas.toString());

        notas.removeIf(next -> next < 7);
        System.out.println("Lista atualizada para notas maiores que 7\n" + notas.toString());

        notas.clear();
        System.out.println("Limpar a lista\n" + notas.toString());
        System.out.println("A lista está vazia? " + notas.isEmpty());

    }
}
