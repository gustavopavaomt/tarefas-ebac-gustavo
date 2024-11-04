package br.com.gpavao.domain;

//classe abastrata que absorve informações do carro
public abstract class Carro {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public abstract void dirigir();
}
