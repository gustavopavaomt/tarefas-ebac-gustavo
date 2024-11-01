import domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Array principal que armazena uma lista de pessoas usando OOP
    private static List<Person> persons = new ArrayList<Person>();

    public static void main(String[] args) {
        onEnable();
    }

    private static void onEnable() {
        //Neste metodo é gerado nosso sistema dando opcoes para o usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo, Escolha uma opc");
        System.out.println("1. Cadastrar pessoa");
        System.out.println("2. Listar pessoas");
        System.out.println("3. Sair");
        int opc = sc.nextInt();
        //pegamos a opc e chamamos a funcao runSystem passando a opc como parametro
        runSystem(opc);
    }

    private static void runSystem(int opc) {
        //criamos um switch que ira ver qual opc que o user ira escolher e para cada opc temos uma funcao
        switch (opc) {
            case 1:
                cadastarUser();
                break;
            case 2:
                listarUsers();
                break;
            case 3:
                return;
            default:
                System.out.println("Opc nao encontrado!");
                main(null);
                break;
        }
    }


    private static void cadastarUser() {
        //Aqui cadastramos nosso usuario na memoria usando a class Person e armazenando os valores no nosso Array principal
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome da pessoa?");
        String pessoa = sc.nextLine();
        System.out.println("Qual o sexo? (Masculino / Feminino)");
        String sexo = sc.nextLine();
        Person p = new Person(pessoa,sexo);
        persons.add(p);
        System.out.println("Cadastrado com sucesso!");
        onEnable();
    }

    private static void listarUsers() {
        //Aqui listamos os usuarios com base no nosso Array principal
        for(Person list : persons){
            System.out.println(list.toString());
        }
        onEnable();
    }

}