package br.com.gpavao;

import java.util.List;

class Person {
    private String name;
    private Character gender;


     Person() {
    }

    public Person(String name, Character gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Character getGender() {
        return gender;
    }


    public static List getPersons(){
        Person p1 = new Person("Maria",'F');
        Person p2 = new Person("John",'M');
        Person p3 = new Person("Ana",'F');
        Person p4 = new Person("Gustavo",'M');
        Person p5 = new Person("Clara",'F');
        return List.of(p1,p2,p3, p4,p5);
    }


}