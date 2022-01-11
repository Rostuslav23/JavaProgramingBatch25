package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        int maximumNumber = -2145679675; // maximumN = 1 --> 2 -- > 5 --> 10 --> 100;
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {

         System.out.println("Enter number 5 times ");
         int num = scan.nextInt(); // 1 , 2 , 5 , 10, 100 ;

         if (num > maximumNumber){
             maximumNumber = num ;
         }

        }

        System.out.println("maximumNumber = " + maximumNumber);










        /*
        Write a program that asks the user to enter a number for 5 times
        return the max number
         */
    }
}
