package br.com.gpavao;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class PersonTest {

    //teste para gerenciar a lista de pessoas com apenas do genero feminino
    @Test
    public void testClassPerson(){
        List<Person> list = Person.getPersons();
        List<String> listMales = list.stream().filter(index -> index.getGender().equals('F'))
                .map(Person::getName).collect(Collectors.toList());

         Assert.assertTrue(listMales.contains("Clara"));
    }

    //teste para checar se o construtor não é null
    @Test
    public void testConstructorPerson(){
        Person person = new Person();
        Assert.assertNotNull(person);
    }
}
