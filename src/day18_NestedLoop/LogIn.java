package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter username:");
        String u = scan.next();

        System.out.println("Enter password:");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("Logged In");
        } else{
            for (int i = 0; i < 3 ; i++) {
                System.err.println("Incorrect username or password");
                System.out.println("Enter username:");
                u = scan.next();
                System.out.println("Enter password:");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
                    System.out.println("Logged In");
                    break;
                }
            }

            if ( ! (u.equals("Cydeo") && p.equals("WoodenSpoon")) ){
                System.err.println("Your account is locked , please contact support team");
            }
        }

        scan.close();







    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */
