package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name :");
        String fullName = input.nextLine(); // javaProg Enter

        System.out.println("Enter your building number");
        String building =  input.next();  // 5928A

        input.nextLine();

        System.out.println("Enter your Street name:");
        String street = input.nextLine(); // airport RD.Enter

        System.out.println("Enter your city name:");
        String city = input.nextLine(); // Destin

        System.out.println("Enter your state name:");
        String state =input.next();  // FL

        System.out.println(" Enter a zip code :");
        String zipCode = input.next(); //32541

        input.nextLine();

        System.out.println("Enter your country name:");
        String country =input.nextLine();

        System.out.println("fullName");








        /*
        1. Enter Name (nextLine() )
        2. buliding num (next() )
        3. street name (nextLine() )
        4. city name  (nextLine() )
        5. state (FL) ( next() )
        6. zipCode  (next () )

        Display shipping address

         */





    }


}
