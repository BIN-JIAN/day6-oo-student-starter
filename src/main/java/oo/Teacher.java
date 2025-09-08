package oo;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

  private List<Klass> klasses;

  public Teacher(int id, String name, int age) {
    super(id, name, age);
    this.klasses = new ArrayList<>();
  }
  @Override
  public String introduce (){
    return  super.introduce()+",I am a teacher";
  }

  public void assignTo(Klass klass){
    if (!klasses.contains(klass)) {
      klasses.add(klass);
    }
  }

  public boolean belongsTo(Klass klass) {
    return klasses.contains(klass); // 检查班级是否在列表中
  }


}
