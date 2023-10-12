package person;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();

        Person person2 = new Person("Henry");

        Person person3 = new Person(23);

        Person person4 = new Person("Dante", 20);

        person1.setName("Julio");
        person1.setAge(29);

        person2.addName("Henry");
        person2.addName("Henny");

        person2.removeName("Jordan");

        displayPersonInfo(person1);
        displayPersonInfo(person2);
        displayPersonInfo(person3);
        displayPersonInfo(person4);
    }

    private static void displayPersonInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        List<String> names = person.getListOfNames();
        System.out.println("List of Names: " + names);

        System.out.println("Size of List: " + person.getSizeOfList());
        System.out.println("-----------------------------");
    }
}
