package com.study;

public class Carro extends Veiculo{

    String cor;
    String modelo;
    int capacidadeTanque;

    public Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double valorTanqueCheio(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}
