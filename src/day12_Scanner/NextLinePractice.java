package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age :");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter name :");
        String fullName =input.nextLine();

        System.out.println("Enter your GPA:");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Enter School name :");
        String schoolName = input.nextLine();




        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);

        input.close();










        /*
        1. enter age (nextInt() )
        2. full name (nextLine() )

         */



    }
}
