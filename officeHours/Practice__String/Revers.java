package Practice__String;

import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String word = scan.nextLine();

        if (word.length() == 5){
            char ch1 = word.charAt(0);
            char ch2 = word.charAt(1);
            char ch3 = word.charAt(2);
            char ch4 = word.charAt(3);
            char ch5 = word.charAt(4);

            System.out.println(ch5 +""+ch4+""+ch3+""+ch2+""+ch1);
        } else if (word.length() < 5){
            System.out.println("too short");
        } else{
            System.out.println("too long");
        }








   /*
Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.
    */




    }
}
