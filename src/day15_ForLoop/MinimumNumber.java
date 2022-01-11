package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {



            int minimumNumber = 2145679675; // anu number that user gonna enter will be less then 213456796
            Scanner scan = new Scanner(System.in);

        for (int i = 10 ; i < 15; i ++){
            System.out.println("enter number 5 times");
            int num = scan.nextInt();

            if (num < minimumNumber);
            minimumNumber = num;
        }


        System.out.println("minimumNumber = " + minimumNumber);








        /*
        Write a program that asks the user to enter a number for 5 times
        return the min number
         */


    }
}
