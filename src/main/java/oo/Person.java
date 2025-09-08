package oo;

public class Person {

  private  int id;
  private final String name;
  private int age;
  public int getId() {
    return id;
  }

  public int getAge() {
    return age;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Person(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public String introduce (){
     return  "My name is %s,I am %d years".formatted(name,age);
  }
  public static boolean equals(Person person1, Person person2) {
    return person1.getId()==person2.getId();
  }
}
