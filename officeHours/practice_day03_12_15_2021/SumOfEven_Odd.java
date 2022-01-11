package practice_day03_12_15_2021;

import java.util.SimpleTimeZone;

public class SumOfEven_Odd {

    public static void main(String[] args) {


/*
(SumOfEven_Odd)
Write a program using while loop, that calculates the sum of the even numbers between 0 and 10
*/
    int sumOfEven = 0;
    int somOfOdd = 0;
    int i = 0 ;

    do {


    if (i % 2 == 0){
      sumOfEven += i;
    } else {
      somOfOdd += i ;
    }
    i++;
    }
    while (i <= 10 );
        System.out.println("Sum of even numbers are "+sumOfEven);
        System.out.println("Sum of even numbers are "+somOfOdd);
    }

}
