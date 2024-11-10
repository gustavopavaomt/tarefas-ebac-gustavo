import java.util.List;

class Person {
    private String name;
    private int age;
    private Character gender;

    public Person(){}

    public Person(String name, int age, Character gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public static List getPersons(){
        Person p1 = new Person("Maria",20,'F');
        Person p2 = new Person("John",21,'M');
        Person p3 = new Person("Ana",22,'F');
        Person p4 = new Person("Gustavo",23,'M');
        Person p5 = new Person("Clara",29,'F');
        return List.of(p1,p2,p3, p4,p5);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}