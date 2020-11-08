package ch.hslu.sw_07;

import ch.hslu.sw_05.chemicalElement.Nitrogen;
import ch.hslu.sw_05.chemicalElement.Temperature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import nl.jqno.equalsverifier.*;
import static org.assertj.core.api.Java6Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    public void setup(){
        person = new Person(10, "Vondru", "Nicolas");
    }

    @Test
    public void checkId(){
        assertEquals(10, person.getID());
    }

    @Test
    public void checkLastName(){
        assertEquals("Vondru", person.getLastName());
    }

    @Test
    public void checkPreName(){
        assertEquals("Nicolas", person.getPreName());
    }

    @Test
    public void checkFullName(){
        assertEquals("Nicolas Vondru", person.getFullName());
    }

    @Test
    public void checkEqualsContract(){
        EqualsVerifier.forClass(Person.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void checkPersonEquality(){
        Person other = person;
        assertEquals(other, person);
    }

    @Test
    public void checkPersonInequality(){
//      results in "true" because the equals() method of Person is overridden and checks for equal values (ID, lastName and preName).
//        The objects 'other' and 'person' are still individual objects which live in different parts of memory.
        Person other = new Person(10, "Vondru", "Nicolas");
        assertEquals(other, person);
    }

    @Test
    public void checkPersonHashCodes(){
        Person other = new Person(10, "Vondru", "Nicolas");
        assertEquals(other.hashCode(), person.hashCode());
    }

//    should crash!
    @Test
    public void checkClass(){
        Nitrogen nitrogen = new Nitrogen(new Temperature(273.15f));
        assertEquals(nitrogen, person);
    }

//    should crash!
    @Test
    public void checkNull(){
        assertEquals(null, person);
    }

    @Test
    public void checkOtherSmallerThanPerson(){
        Person other = new Person(person.getID() - 1, "Mustermann", "Max");
        assertEquals(-1, other.compareTo(person));
    }

    @Test
    public void checkOtherEqualsRankOfPerson(){
        Person other = new Person(person.getID(), "Mustermann", "Max");
        assertEquals(0, other.compareTo(person));
    }

    @Test
    public void checkOtherGreaterThanPerson(){
        Person other = new Person(person.getID() + 1, "Mustermann", "Max");
        assertEquals(1, other.compareTo(person));
    }


}