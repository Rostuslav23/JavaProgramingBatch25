package day12_Scanner;

import java.util.Scanner;

public class Scanner_Practice3_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         //

        System.out.println("Enter your full name");
        String fullName = input.nextLine();   //Wooden SpoonEnter

        System.out.println("Enter your programing language");
        String programing = input.nextLine(); // Java Programing LanguageEnter

        System.out.println("Enter your age");
        int age = input.nextInt(); // 24

        input.nextLine(); // Enter

        System.out.println("Enter your school name");

        String schoolName = input.nextLine(); //Enter

        System.out.println("fullName = " + fullName);
        System.out.println("programing = " + programing);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();







    }
}
