package day3_12_18_2021;

public class SwapTwoNumbersWithoutThirdVarible {

    public static void main(String[] args) {


    int a = 10;
    int b = 15;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a+b; // 25
        b = a-b; // 25-10=15
        a = a-b; // 25-15=10

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }}
