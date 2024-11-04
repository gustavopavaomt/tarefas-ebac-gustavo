package br.com.gpavao.domain;

import java.util.ArrayList;
import java.util.List;

// Aqui temos uma classe que irá adicionar e listar os carros de forma Genérica
public class ListaCarros <T extends Carro>{
    private List<T> carros;

    public ListaCarros() {
        this.carros = new ArrayList<T>();
    }
    public void adicionarCarro(T carro) {
        carros.add(carro);
    }
    public void listarCarros(){
        for(T carro : carros){

            System.out.println(carro.getModelo());
            carro.dirigir();
        }
    }
}
