package practice_01_05_22;

import java.util.Arrays;

public class RemoveSpaces {

    public static void main(String[] args) {
        String input = "  Hello world      I      love      Java    ";
        removeSpaces(input);
    }

    public static void removeSpaces(String str){
        String result = "";
        String[] strArray = str.trim().split(" ");
       // System.out.println(Arrays.toString(strArray));

        for (String each : strArray){
            if (! each.isEmpty()){
                result += each + " ";
            }
        }
        System.out.println(result);

    }

}
/*
     Task 3 :   Write a method that can remove  all extra space from String

     Input: "  Hello world      I      love      Java    "
     Output: Hello world I love Java
*/

