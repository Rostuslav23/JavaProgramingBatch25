package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice3_WITH_EXPLANATION {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt(); // 5 total numbers

        if (length <= 0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
//         array need to have enough capacity to contain all the elements/numbers0 user going
      int [] numbers = new int[length]; // [0, 0, 0, 0, 0,] if user enter '5' total numbers, then user need to enter 5 numbers
//         after that it will change a value [1, 10, 100, 32, 23]
        for (int i = 0; i < length; i++) { // i:0, 1 , ... represent all of index NUMBER !
            System.out.println("Enter a number :");
            numbers [i] = scan.nextInt(); // 5 - each input user provide- numbers will be asign to ARRAYS
        }

        System.out.println(Arrays.toString(numbers));

        scan.close();
    }
}
