package day14_String;

import java.util.Locale;

public class FormatFullName {
    public static void main(String[] args) {
    String firstName = "cYDeo",
           lastName = "SCHOOL";

    // firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
    //          _C_                    +                  ydeo ==> "Cydeo"


        firstName = ("" + firstName.charAt(0) ).toUpperCase() + firstName.substring(1).toLowerCase();
         //             _C_                           +               ydeo ==> "Cydeo"



        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName);
        System.out.println(lastName);

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);











    }
}
