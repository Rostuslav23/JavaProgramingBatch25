package day13_String;

import java.util.Scanner;

public class practice_FirstAndLast {
    public static void main(String[] args) {
        /*
        1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a sentence");
        String sentence = scan.nextLine();

        char lastChar = sentence.charAt(sentence.length()- 1);
        char firstChar = sentence.charAt(0);

        System.out.println("First char is " + firstChar);
        System.out.println("Last char is " + lastChar);

        scan.close();












    }
}
