package practice_day02_IF_LooP;

import java.util.Scanner;

public class FirstTwoLetters {
    public static void main(String[] args) {
/*
Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
If the string is shorter than length 2, return whatever there is, so "X" yields "X",
and the empty string "" yields the empty string "".

Input :"Hello"   → "He"
Input :"abcdefg" → "ab"
Input :"a"         → "a"
Input :""         → "It can not be empty"
*/
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = s.next();

        if (word.isEmpty()){
            System.out.println("It can not be empty");
        }else if(word.length() <= 2){
            System.out.println(word);
        }else {
            System.out.println(word.substring(0,2));
            System.out.println(""+word.charAt(0)+word.charAt(1));
        }
        s.close();













    }
}