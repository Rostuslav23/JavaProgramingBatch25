package Practice__String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first Name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last Name");
        String lastName = scan.nextLine();


        firstName = firstName.toUpperCase();
        lastName = lastName.toUpperCase();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        System.out.println(f + "." + l);

        scan.close();






/*
2. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */





    }
}
