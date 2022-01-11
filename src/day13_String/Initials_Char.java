package day13_String;

import java.util.Scanner;

public class Initials_Char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name");
        String  firstName = scan.nextLine();// Java


        System.out.println("Enter last name");
        String lastName = scan.nextLine();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initial = f + "." +l;

        System.out.println("initial = " + initial);

        scan.close();













    }
}
