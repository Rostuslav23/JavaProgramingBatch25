package day06_Primitive_Type_Castings;

public class Birhtday {
    public static void main(String[] args) {
        String name= "John";
        int bith_day= 25;
        String birthMonth = "April";
        int birthYear = 1995;

        System.out.println(name + " was born on " + birthMonth + "/" + bith_day + "/" + birthYear);

        System.out.println("--------------------------------------------------");

        String bookName= "Harry Potter";

        System.out.println("My favorite book is \"" + bookName + "\"" );


    }
}

/* 1. Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.

 */