package day14_String;

import java.util.Scanner;

public class String_Practicing {
    public static void main(String[] args) {
        //indexOf(), charAt(), lastIndexof(), replace() , repeat(), toUpperCase()
        //toLowerCase, Substring(), Substring(beggining.end) ,replaceFirst(),
        //firstIndexof(), lenght(), contains(),
        //, trim(), startsWith(), endsWith(), isEmpty().
        // boolean  equals(), equalsIgnoreCase(),isBlank(),
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a sentence");
        String result1 = scan.nextLine();

        char firstChar = result1.charAt(0);
        char lastChar = result1.charAt(result1.length()-1);

        String r = firstChar + "" + lastChar ;

        System.out.println(r);

        scan.close();

    }
}
/*
write a program that asks user to enter a sentence.
then print the first & last characters of the sentence
 */