package br.com.agryo.oo;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    //Construtor
    public Carro() {
    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //Gets e Sets
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

    //Métodos
    double valorTotalTanque(double valorGasolina) {
        return capacidadeTanque * valorGasolina;
    }
}
