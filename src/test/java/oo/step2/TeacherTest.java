package oo.step2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import oo.Person;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

public class TeacherTest {

    // when introduce a teacher, then return a message with name and age

    // when equals two same id teacher then return true

    // when equals two different id teacher then return true
    @Test
    void should_introduce_teacher_when_introduce_given_a_teacher(){

      Teacher teacher = new Teacher(1,"lili",20);
      assertEquals("My name is lili,I am 20 years,I am a teacher",teacher.introduce());
    }
  // when equals two same id student then return true

  @Test
  void should_equals_id_when_return_then_true(){
    Teacher teacher1 = new Teacher(1,"lili",20);
    Teacher teacher2 = new Teacher(1,"Tom",22);
    boolean result = teacher1.equals(teacher1,teacher2 );
    assertEquals(true,result);
  }

  // when equals two different id student then return true
  @Test
  void should_euqals_different_id_when_return_given_true(){
    //
    Teacher teacher1 = new Teacher(1,"lili",20);
    Teacher teacher2 = new Teacher(3,"Tom",22);
    boolean result = Teacher.equals(teacher1 ,teacher2);
    assertNotEquals(true,result);

  }
}
