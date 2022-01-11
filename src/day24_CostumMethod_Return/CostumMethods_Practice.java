package day24_CostumMethod_Return;

import java.util.Locale;

public class CostumMethods_Practice {

    public static void main(String[] args) {

        initialsOfPerson("Ross","boss");

        System.out.println("-----------------------------------");

        domain("Cydeo.School@gmail.com");

        System.out.println("-----------------------------------");

        String [] emails = {"josh@gmail.com", "rossboss@boss.com","Shrk@amazaon.com","HelloWorld@mail.com"};

        for (String email : emails) {
            domain(email);
        }
        System.out.println("-----------------------------------");

        nameOfMonth(6);

        System.out.println("-----------------------------------");

        nameOfDay(2);



    }
    // 1. Create a method that can display the initials of the person initialsOfPerson (String firstName, String lastName)

    public static void initialsOfPerson (String firsName, String lastName){

        String initials = firsName.charAt(0)+"."+lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println("initials = " + initials);

    }

    // 2. Create a method that can display the domain of the email domain (String email)

    public static void domain  (String email){  // Cudeo.School@gmail.com

        String domain = email.substring(email.indexOf("@")+1 , email.lastIndexOf(".")  );
        System.out.println("domain = " + domain);

    }

    // 3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth (int number){
        String name = "";

        if (number >=1 && number <= 12){
            //12
            name = (number == 1)? "Jan" :(number == 2)? "Feb" :(number == 3)? "Mar" :(number == 4)? "Apr"
                    :(number == 5)? "May" :(number == 6)? "June" :(number == 7)? "Jul" :(number == 8)? "Aug"
                    :(number == 9)? "Sep" :(number == 10)? "Oct" :(number == 11)? "Nov" : "Dec";

        } else {
            name = "Invalid";
        }

        System.out.println("Month name = " + name);
    }

    // 4. Create a method that can print the name of the day based on the given number to the method

     public static void nameOfDay (int number){

         String days = "";

        if (number >=1 && number <= 7){

             days = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday"
                    : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";

        } else {
            System.out.println("Invalid day");
        }

         System.out.println("Days = "+ days);

     }

     // 5. Create a method that can print how many days a month has

    public static void daysInMonth(int number, int year){



    }







}
