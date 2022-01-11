package day2_12_11_2021;

public class Color_Print {

    public static void main(String[] args) {

        /*
                Given a string, if the string begins with "red" or "blue" print that color string,
                otherwise print the empty string.

                input :"redxx" → "red"
                input :"xxred" → ""
                input :"blueTimes" → "blue"
         */

        String word = "redxx";
//                     01234
        String result1 = "";

        if (word.startsWith("red")) {
            result1 = "\"red\"";
        }else if (word.startsWith("blue")) {
            result1 = "\"blue\"";
        }else
            result1 ="\"\"";

        System.out.println("result1 = " + result1);



    }
}
