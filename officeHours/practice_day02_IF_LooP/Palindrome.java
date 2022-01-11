package practice_day02_IF_LooP;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
/*
 Write a program that can check if the given String is palindrome
 Ex:
   input:
   Level

  output:
   true

  input:
  Anna

  output:
  true
  */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = s.nextLine();
        String result = "";

        for  (int i= word.length()-1 ; i >= 0 ; i--){
            result += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(result);

        System.out.println(isPalindrome);

        s.close();


    }
}
