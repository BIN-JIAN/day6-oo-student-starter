package oo.step4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import oo.Klass;
import oo.Teacher;
import org.junit.jupiter.api.Test;

public class TeacherTest {

    // when belongsTo give teacher does not teach the class then return false
     @Test
     void should_belongsTo_give_when_not_teach_then_return_false(){
       Teacher teacher1 = new Teacher(1,"aa",35);
       Klass klass1 = new Klass(1);
       Klass klass2 = new Klass(4);
       teacher1.assignTo(klass2);
       assertEquals(false,teacher1.belongsTo(klass1));
     }
    // when belongsTo give teacher teach the class then return true
     @Test
     void should_belongsTo_given_when_teach_return_true(){
       Teacher teacher1 = new Teacher(1,"aa",35);
       Klass klass1 = new Klass(1);
       teacher1.assignTo(klass1);
       assertEquals(true,teacher1.belongsTo(klass1));
     }

    // when belongsTo given teacher teach multiple classes then return true

    //when introduce given teacher teach one class then return message

    // when introduce given teacher teach multiple classes then return message

    // when isTeaching given student not in the class taught by teacher then should return false

    // when isTeaching given student in the class taught by teacher then return true

    // when isTeaching given student in any class taught by teacher then return true
}
