package day23_CustomMethod_Void;

public class CustomMethodsWith_Parameters {

    public static void main(String[] args) {

       // oddOrEven(); - the method demands additional info to complete it's task

        oddOrEven(10);

        ageOfPerson(1996);

        printNumbers(1,100);

    }




    // creat a function that can check if a number is odd number of even number
    public static void oddOrEven(int number){ // 10

        if (number%2 == 0){
            System.out.println( number+" is - Even Number");
        } else {
            System.out.println( number+ " is - Odd Number");
        }
    }



    //creat a function that can display age of the person
    public static void ageOfPerson (int birthYear){

        int age = 2021 - birthYear;

        System.out.println("Your age is: "+age);
    }



    // creat a function that can  print all the numbers between X and Y
    public static void printNumbers(int x, int y){

        for (int i = x; i <= y ; i++) {
            System.out.print(" " +i);
        }
    }
}
