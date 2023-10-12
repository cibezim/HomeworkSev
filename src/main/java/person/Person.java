package person;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Integer age;
    private List<String> listOfNames = new ArrayList<>();

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getListOfNames() {
        return listOfNames;
    }

    public void addName(String name) {
        listOfNames.add(name);
    }

    public void removeName(String name) {
        listOfNames.remove(name);
    }

    public int getSizeOfList() {
        return listOfNames.size();
    }
}

