package oo.step1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import oo.Person;
import org.junit.jupiter.api.Test;

public class PersonTest {


    // when introduce a person, then return a message with name and age
    @Test
    void should_introduce_self_when_introdue_given_a_person(){

      //
      Person person = new Person(1,"Jon",18);


      assertEquals("My name is Jon,I am 18 years",person.introduce());
    }
    // when equals two same id person then return true{


    @Test
    void should__when__given_true(){

      //
      Person person1 = new Person(1,"Jon",18);
      Person person2 = new Person(1,"Tom",20);
     boolean result = Person.equals(person1,person2);
     assertEquals(true,result);

    }

    // when equals two different id person then return true
    @Test
    void should_euqals_when__given_true(){

      //
      Person person1 = new Person(1,"Jon",18);
      Person person2 = new Person(3,"Tom",20);
      boolean result = Person.equals(person1,person2);
      assertEquals(false,result);

    }
}
