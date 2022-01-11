package Practice__String;

import java.util.Scanner;

public class Emty_Or_Not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a string");
        String str = scan.nextLine();

        int strLength = str.length();
        String result = "";

        if (strLength == 0){
            result = "String is empty";
        } else if (strLength <= 3){
            result = str;
        } else {
            result = ""+ str.charAt(strLength -3) + str.charAt(strLength-2)+
                    str.charAt(strLength-1);
        }
        System.out.println(result);

        scan.close();












    }
}
 /*
 3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
  */