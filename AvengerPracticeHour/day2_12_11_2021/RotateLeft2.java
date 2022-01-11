package day2_12_11_2021;

import java.util.Scanner;

public class RotateLeft2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = s.next();

        String temp2 = "";

        for (int i = 2; i < word.length(); i++) {
            temp2+= word.charAt(i);
        }


        for (int i = 0; i < 2; i++) {
            temp2 += word.charAt(i);
        }

        System.out.println("temp2 = " + temp2);




        System.out.println("-----------------------------------------");

// Solution - - - - - - - - - - - 2
//        String word = "Hello";
//                       01234
//        String temp = word.substring(2) +word.substring(0,2) ;

//        System.out.println("temp = " + temp);

     s.close();
    }
}
/*
                Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
                The string length will be at least 2.

                input :"Hello" -> "lloHe"
                input :"java" → "vaja"
                input :"Hi" → "Hi"
 */