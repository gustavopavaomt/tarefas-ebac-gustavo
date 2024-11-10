import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new Person().getPersons();
        list.stream().filter(index -> index.getGender().equals('F'))
                .forEach(System.out::println);


    }
}