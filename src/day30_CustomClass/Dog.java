package day30_CustomClass;

public class Dog {

    public String name ;
    public String breed ;
    public String size ;
    public String color ;
    public int age ;
    public char gender;

    public void setInfo(String dogName,String dogBreed, String dogSize , String dogColor ,int dogAge, char dogGender ){
        name = dogName;
        breed = dogBreed;
        size = dogSize;
        color = dogColor;
        age = dogAge;
        gender = dogGender;

    }

    public void eat (){
        System.out.println(name+" is eating");
    }

    public void bark (){
        System.out.println(name+" is barking");
    }

    public void play(){
        System.out.println(name+" is playing");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Attributes :
    name,age,gender,breed,size,color

Actions:
    eat() , play() , bark() ...
 */