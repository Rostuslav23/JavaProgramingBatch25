package practice_day03_12_15_2021;

import java.util.Scanner;

public class StringTimes {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a word. ");
        String word = s.nextLine();

        System.out.println("Eneter any positive number ");
        int num = s.nextInt();

        int count = 0 ;
        String sum = "";

     //       while (count < num){
     //       sum +=word;   // sum = "Ho" + "Ho"  = "HoHo
     //       count ++ ;
     //   }

        for ( int i = 0 ; i < num; i ++){
            sum +=word;
        }
        System.out.println(sum);






    }
}

/*
                    (StringTimes)
                    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

                     input String : Hi  ,  input int : 2

                     output: HiHi
 */

