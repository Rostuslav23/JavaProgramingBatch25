package day14_String;

import java.util.Scanner;

public class Replace_a_with_x {
    public static void main(String[] args) {
        /*
        1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
         */
        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next(); // only one input from usser --> xcodex

        if (word.charAt(0) == 'x'){
            word = word.replaceFirst("x","a");
        }

        System.out.println(word);


    }
}
