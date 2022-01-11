package day20_Array;

import java.util.Arrays;

public class Array_From_Z_to_A {

    public static void main(String[] args) {

    char [] alphabets = new char [26]; // [Z-A]
      //                : i      ch
      //  alphabets[0] = 'Z'; // 90 FROM ASCI TABLE
      //  alphabets[1] = 'Y'; // 89 FROM ASCI TABLE
      //  alphabets[2] = 'X'; // 88 FROM ASCI TABLE
      // System.out.println(alphabets); error - hashCODE

        char ch = 'Z';


        for (int i = 0; i < alphabets.length; i++, ch --) {
            alphabets [i] = ch;
        }

        System.out.println(Arrays.toString(alphabets));
    //    System.out.println(alphabets[0]);_it's NOT an Array Variable. THATS AN ELEMENT OF _ARRAY_
}
}