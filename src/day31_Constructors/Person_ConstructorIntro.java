package day31_Constructors;

public class Person_ConstructorIntro {

    public String name ;
    public char gender;
    public int age ;

    public Person_ConstructorIntro (String name ,char gender,int age){
    this.name = name;
    this.gender = gender;
    this.age = age ;
    }


    public String toString() {
        return "Person_ConstructorIntro{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }


}
