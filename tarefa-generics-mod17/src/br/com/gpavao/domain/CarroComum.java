package br.com.gpavao.domain;

//classe model de carros comuns
public class CarroComum extends Carro {

    public CarroComum(String modelo) {
        super(modelo);
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigindo um carro do tipo " + getClass().getSimpleName());
    }


}
