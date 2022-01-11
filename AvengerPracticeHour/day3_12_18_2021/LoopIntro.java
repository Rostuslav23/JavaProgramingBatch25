package day3_12_18_2021;

public class LoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 100 ; i++) {
            System.out.println("" +i);
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");

        // even number
        for (int i = 2; i < 100 ; i+=2) {
            System.out.println("" +i);
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");

        // odd numbers
        for (int i = 1; i < 100 ; i+=2) {
            System.out.println(i+"");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");

        // divide by numbers with 5
        for (int i = 0; i < 100 ; i+=5) {
            System.out.println(i + "");
        }
            //even number from 100 to 0
        for (int i = 98; i < 0 ; i-=2) {
            System.out.println(i+"");

        }
    }}
