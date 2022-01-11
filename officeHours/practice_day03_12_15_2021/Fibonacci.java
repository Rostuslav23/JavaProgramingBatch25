package practice_day03_12_15_2021;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("how many fibunacci numbers do you want to enter");
        int number = s.nextInt();

        int [] fibo = new int [number];
        fibo [0] = 0;
        fibo [1] = 1;

        for (int i = 2; i < number; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        System.out.println(Arrays.toString(fibo));
    }
}
