package day30_CustomClass;

import ArraysPrac.A;
import day28_Arraylist.ArrayListIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTask {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers,0,numbers.size()-1);

        System.out.println(numbers);

        System.out.println("---------------------------------------------------------------------task 2.solution 1");

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);

        int size = list.size();

        list.removeAll(Arrays.asList(0) );
        System.out.println(list);

        int newSize = list.size();

        int totalNumberOfZeros = size - newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);

        for (int i = 0; i <  totalNumberOfZeros; i++) {
            list.add(0);
        }

        System.out.println(list);

        System.out.println("---------------------------------------------------------------------task2.solution 2.");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each:list2) {
            if (each != 0){
                result.add(each);
            }
        }
        System.out.println(result);


        for (Integer each:list2) {
            if (each == 0){
                result.add(each);
            }
        }
        System.out.println(result);


        System.out.println("---------------------------------------------------------------------");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(  chars  ); // add all the characters
        letters.removeIf( p-> !Character.isLetter(p) ) ; // Lambda,   remove the characters that are not letters

        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>( chars );
        digits.removeIf(p-> !Character.isDigit(p));

        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar = new ArrayList<>( chars );
        specialChar.removeAll( letters );
        specialChar.removeAll( digits );

        System.out.println("specialChar = " + specialChar);

    }
}
/*
1. write a program that can swap the first and last elements of an ArrayList of Integers

2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]


3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */