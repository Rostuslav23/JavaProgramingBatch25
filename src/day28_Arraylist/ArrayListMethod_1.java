package day28_Arraylist;

import java.util.ArrayList;

public class ArrayListMethod_1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);// index : 0
        numbers.add(20);// 1
        numbers.add(30);// 3
        numbers.add(40);// 4
        numbers.add(50);// 6
        numbers.add(60);// 7

        numbers.add(2,25);// 2
        numbers.add(5,45);//5
        System.out.println(numbers);

        System.out.println(  numbers.size() );
        int lastIndex = numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < numbers.size() ; i++) { // to get all of the elements of Array List
            System.out.println(numbers.get(i));
        }

        System.out.println("---------------------------------------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript");
        list.set(3,"C++");

        System.out.println(list);

        System.out.println("---------------------------------------------------------------");

        ArrayList<String> empolyees = new ArrayList<>();

        empolyees.add("Ross0");
        empolyees.add("Ross1");
        empolyees.add("Ross2");
        empolyees.add("Ross3");
        empolyees.add("Ross4");
        empolyees.add("Ross5");
        empolyees.add("Ross6");

        System.out.println(empolyees);

        empolyees.remove(0);

        System.out.println(empolyees);

        empolyees.remove(0);

        System.out.println(empolyees);

        empolyees.remove(1);

        System.out.println(empolyees);

        empolyees.remove(empolyees.size()-1 );

        System.out.println(empolyees);

        boolean r1 = empolyees.remove("Ross5");

        System.out.println(empolyees);

        boolean r2 = empolyees.remove("Ross4");

        boolean r3 = empolyees.remove("Ross2");

        System.out.println(empolyees);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

    }
}
