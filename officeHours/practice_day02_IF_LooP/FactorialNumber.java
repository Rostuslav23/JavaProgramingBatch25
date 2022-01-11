package practice_day02_IF_LooP;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
/*
/* Write a program that can return the factorial number of any given number

         Ex:
         input: 5
         output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int number = s.nextInt();

        int result = 1;

        if (number > 2 ){
            for (int i = number ; i >=1; i--){
                result *= i ; // multiply each number - result = result*i 5*4*3*2*1 = 120
            }
        }else {
            result = number ;
        }

        System.out.println("Factorial of number is: "+result);

        s.close();
    }
}
