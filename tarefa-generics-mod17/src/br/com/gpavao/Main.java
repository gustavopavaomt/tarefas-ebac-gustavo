package br.com.gpavao;

import br.com.gpavao.domain.Carro;
import br.com.gpavao.domain.CarroComum;
import br.com.gpavao.domain.CarroEsportivo;
import br.com.gpavao.domain.ListaCarros;


public class Main {
    public static void main(String[] args) {
        //criamomos umas instancia para class Lista de carros que ira absorver uma informação generica
        ListaCarros<Carro> lista = new ListaCarros<>();

        //instanciamos os carros apartir do tipo
        Carro comum = new CarroComum("Corolla");
        Carro esportivo = new CarroEsportivo("Porshe 911");

        //fazemos a listagem pelos metodos da class Lista de carros
        lista.adicionarCarro(comum);
        lista.adicionarCarro(esportivo);
        lista.listarCarros();

    }
}