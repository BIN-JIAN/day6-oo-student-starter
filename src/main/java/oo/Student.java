package oo;

public class Student extends Person {
  public Klass klass;
  private int number;
  public Klass recentKlass;

  public Student(int id, String name, int age) {
    super(id, name, age);
  }
  @Override
  public String introduce (){
    return  super.introduce()+",I am a student";
  }
  public boolean isIn(Klass klass){
    return this.klass==klass;
  }
  public void join(Klass klass){
    this.klass=klass;
  }
  public Klass getRecentKlass() {
    return recentKlass; // 返回最近加入的 Klass
  }
}
