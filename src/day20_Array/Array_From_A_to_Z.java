package day20_Array;

import java.util.Arrays;

public class Array_From_A_to_Z {
    public static void main(String[] args) {

        char [] letters = new char [26];

      /*  letters[0]= 'A';
          letters[1]= 'B';
          letters[2]= 'C';
       */

        for (char i = 'A' , j = 0 ; i <= 'Z' && j < letters.length; i++, j ++){ // i : index number 0 - last index - 26
            letters[j] = i;
        }


        System.out.println(Arrays.toString(letters)); // [A-Z]

    }
}
