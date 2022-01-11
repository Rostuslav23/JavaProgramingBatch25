package day34_GarbegeCollection_AccessModifires;

import day30_CustomClass.Dog;
import day30_CustomClass.Student;
import day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        // int n = null ; - compaile error
        //String str = null;
        //System.out.println(  str.toUpperCase()  );


        String str = "Woooden Spoon"; // after line 13 , "Wooden Spoon" will be eligigble for garbage collection .

        str = null;

          System.out.println(str);

        Car car = new Car("Toyota");

        car = null;

        System.out.println(car);

        System.out.println("--------------------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Bubba";

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python";
        language = "Java";

        System.out.println(language);

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>() ;

        list1.add(100);

        ArrayList<Integer> list2 = list1 ;

        list2.addAll(Arrays.asList(200,300,400) );

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);

        System.out.println("--------------------------------------------------");



    }
}