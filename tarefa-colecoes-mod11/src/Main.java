import domain.Pessoas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       exemplo1();
       exemplo2();

    }

    private static void exemplo1() {
        //Parte 1 da tarefa imprimindo nomes em ordem alfabetica / separadas por virgula
        String nomes = "Gustavo,Alex,Bruno,Pedro,Mateus,Joao";
        //colando os nomes em um lista de string usando split para separar os nomes por virgula
        String[] listaNomes = nomes.split(",");
        //ordenando em ordem alfabetica
        Arrays.sort(listaNomes);
        //criando um loop para exibir os nomes
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
    }

    public static void exemplo2(){
        //Parte 2 da task
        List<Pessoas> lista = new ArrayList<>();
        lista.add(new Pessoas("Bruno", "Masculino"));
        lista.add(new Pessoas("Amanda", "Feminino"));
        lista.add(new Pessoas("Carlos", "Masculino"));
        lista.add(new Pessoas("Maria", "Feminino"));
        //Colocando em ordem alfabetica a lista
        Collections.sort(lista);

        //Criando loop para exibir os nomes por sexo usando o metodo toString da nossa classe model Pessoas
        for (Pessoas nome : lista) {
            System.out.println(nome);
        }
    }
}