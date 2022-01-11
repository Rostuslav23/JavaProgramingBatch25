package day13_String;

import java.util.Scanner;

public class My_Info {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // EnterEnter
        System.out.println("Enter your age");
        int age = scan.nextInt(); //19Enter

        System.out.println("Enter your gender");
        String gender =scan.next(); //MaleEnter

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();  // if the previous scanner method that's need used is not nextLine() , then we need to provide one more method

        System.out.println("Enter your phone number");
        long phoneNumber = scan.nextLong();

        System.out.println("Enter your Zipcode");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter a school name");
        String schoolName = scan.nextLine();

        System.out.println("Enter a city name");
        String cityName = scan.nextLine();

        System.out.println("Enter a state name");
        String state = scan.next();

        System.out.println("Enter your building number");
        int buildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String streetName = scan.nextLine();

        scan.close();

        System.out.println("fullName = " + fullName);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("Address: \n\t"+ buildingNumber+ " "+streetName+ "\n\t"+cityName+", "+state+ " " +zipCode);
        System.out.println("School Name = " + schoolName);











/*
1. Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int) ( int --> nextInt() )
            2. Enter your gender (String- One word ONLY --- next()   =and= after that nextLine() )
            3. Enter your full name (String- Multiple words --> nextLine ())
            4. Enter your phone number (long --> nextLong() )
            5. Enter your zip code (int --> nextInt() --> nextLine ())
            6. Enter your School name (String- Can be Multiple words --> nextLine() )
            7. Enter your city name (String- Can be Multiple words  --> nextLine() )
            8. Enter your state name (String- One word ONLY --> next() )
            9. Enter your building number (int -- > nextInt() )
            10. Enter your Street name (String  --> nextLine() )

        MAKE SURE USER CAN ENTER ALL THE INPUT
 */
    }
}
