package oo.step3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import oo.Klass;
import oo.Student;
import org.junit.jupiter.api.Test;

public class StudentTest {

    // when student not join klass and isIn klass then return false
    @Test
    void should_student_not_join_klass_when_return_then_flase(){
      Student student = new Student(1,"kiki",22);
      Klass klass = new Klass(1);
      assertEquals(false,student.isIn(klass));
    }

    // when student join klass and isIn klass then return false
    @Test
    void should_student_join_klass_when_return_then_flase(){
      Student student1 = new Student(1,"kiki",22);
      Klass klass = new Klass(1);
      student1.join(klass);
      assertNotEquals(false,student1.isIn(klass));
    }

    // when student join two klass then return recently klass

     @Test
    void should_student_join_two_klass_then_return_recently_klass(){
       Student student1 = new Student(1,"kiki",22);
       Klass klass1 = new Klass(1);
       Klass klass2 = new Klass(2);
       student1.join(klass1);
       student1.join(klass2);
       assertEquals(2,student1.getRecentKlass().getNumber());
     }
    // when introduce a student is in a class then return message with name age and class

}
