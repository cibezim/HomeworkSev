package person;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PersonTest {

    @Test
    void testDefaultConstructor() {
        Person person = new Person();
        assertNull(person.getName());
        assertNull(person.getAge());
        assertEquals(0, person.getSizeOfList());
    }

    @Test
    void testConstructorWithName() {
        Person person = new Person("Henry");
        assertEquals("Henry", person.getName());
        assertNull(person.getAge());
        assertEquals(0, person.getSizeOfList());
    }

    @Test
    void testConstructorWithAge() {
        Person person = new Person(23);
        assertNull(person.getName());
        assertEquals(Integer.valueOf(23), person.getAge());
        assertEquals(0, person.getSizeOfList());
    }

    @Test
    void testConstructorWithNameAndAge() {
        Person person = new Person("Dante", 320);
        assertEquals("Dante", person.getName());
        assertEquals(Integer.valueOf(320), person.getAge());
        assertEquals(0, person.getSizeOfList());
    }

    @Test
    void testSetNameAndSetAge() {
        Person person = new Person();
        person.setName("Julio");
        person.setAge(29);
        assertEquals("Julio", person.getName());
        assertEquals(Integer.valueOf(29), person.getAge());
        assertEquals(0, person.getSizeOfList());
    }

    @Test
    void testAddAndRemoveNames() {
        Person person = new Person("Henry");
        person.addName("Jordan");
        person.addName("Andy");
        assertEquals(2, person.getSizeOfList());

        person.removeName("Jordan");
        assertEquals(1, person.getSizeOfList());
        assertFalse(person.getListOfNames().contains("Jordan"));
    }
}
