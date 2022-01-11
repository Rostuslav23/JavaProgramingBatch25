package day30_CustomClass;

import java.util.ArrayList;

public class DogObject {

    public static void main(String[] args) {

         Dog dog1 = new Dog();
         dog1.name = "Jake";
         dog1.breed = "Corgy";
         dog1.age = 1;
         dog1.gender = 'M';
         dog1.size = "Small";
         dog1.color = "Black and White";

         Dog dog2 = new Dog();
         dog2.name = "Bubba";
         dog2.breed = "Husky";
         dog2.age = 2;
         dog2.gender = 'F';
         dog2.size = "Medium";
         dog2.color = "Black";

         Dog dog3 = new Dog();
         dog3.setInfo("JJ", "Bulldog","Big","Gray",1,'F');



         System.out.println(dog1);
         System.out.println(dog2);
         System.out.println(dog3);


         dog1.eat();

         dog2.bark();

         Dog dog4 = new Dog();
         dog4.setInfo("Baby","Corgie","Small","White",1,'F');
         Dog dog5 = new Dog();
         dog5.setInfo("Charlie","Labrador","Big","Black",3,'M');

         Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};

         ArrayList<Dog> femaleDogs = new ArrayList<>();
         ArrayList<Dog> maleDogs = new ArrayList<>();

    }
}
