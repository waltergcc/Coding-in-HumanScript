package com.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenar {

    public static void ordenarLista() {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Miu",12,"Amarelo"));
            add(new Gato("Frajola",8,"Preto"));
            add(new Gato("Lului",2,"Tigrado"));
            add(new Gato("Aia",5,"Branca"));
            add(new Gato("Urso",9,"Marron"));
            add(new Gato("Panda",3,"Malhado"));
        }};

        System.out.println("\n---Ordem de inserção---\n" + meusGatos);

        Collections.shuffle(meusGatos);
        System.out.println("\n---Ordem aleatória---\n" + meusGatos);

        Collections.sort(meusGatos);
        System.out.println("\n---Ordem por nome---\n" + meusGatos);
    }

}

class Gato implements Comparable<Gato>{

    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}