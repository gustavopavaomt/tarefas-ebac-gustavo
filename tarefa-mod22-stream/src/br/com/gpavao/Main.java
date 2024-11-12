package br.com.gpavao;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    //testado 100% coverage
    public static void main(String[] args) {
        List<Person> list = Person.getPersons();
        List<String> listMales = list.stream().filter(index -> index.getGender().equals('F'))
                .map(Person::getName).collect(Collectors.toList());
        listMales.forEach(System.out::println);

    }
}