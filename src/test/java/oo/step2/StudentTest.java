package oo.step2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import oo.Person;
import oo.Student;
import org.junit.jupiter.api.Test;

public class StudentTest {

    // when introduce a student, then return a message with name and age
    @Test
    void should_introduce_student_when_introduce_given_a_student(){

      Student student = new Student(1,"Bin",20);
      assertEquals("My name is Bin,I am 20 years,I am a student",student.introduce());
    }
  // when equals two same id student then return true
    @Test
    void should_equals_id_when_return_then_true(){
      Student student1 = new Student(1,"lili",20);
      Student student2 = new Student(1,"Tom",22);
      boolean result = student1.equals(student1,student2);
      assertEquals(true,result);
    }

    // when equals two different id student then return true
    @Test
    void should_euqals_different_id_when_return_given_true(){
      //
      Person person1 = new Person(1,"Jon",18);
      Person person2 = new Person(3,"Tom",20);
      boolean result = Person.equals(person1,person2);
      assertNotEquals(true,result);

    }
}
