package br.com.gpavao.domain;

//classe model de carros esportivos
public class CarroEsportivo extends Carro{

    public CarroEsportivo(String modelo) {
        super(modelo);
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigindo um carro do tipo " + getClass().getSimpleName());
    }
}
