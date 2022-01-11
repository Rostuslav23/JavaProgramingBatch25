package day13_String;

import java.util.Scanner;

public class TwoStings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first String");
        String string1 = scan.nextLine();

        System.out.println("Enter a second String");
        String string2 = scan.nextLine();

        int l1 = string1.length();
        int l2 = string2.length();

        System.out.println("This String is the longest");

        if (l1 > l2){
            System.out.println(string1);
        } else {
            System.out.println(string2);
        }

        scan.close();





    }
}
/*
write a program that asks user to enter two strings, and print out the longest string
 */