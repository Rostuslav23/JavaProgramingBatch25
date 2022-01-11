package day20_Array;

import java.util.Arrays;

public class Array_From_A_To_Z_2 {

    public static void main(String[] args) {

    char[] letters = new char[26];
    char ch = 'A';

        for (int i = 0; i < letters.length ; i++ ) { // or here ch++
            letters[i] = ch; // or letters[i] = ch++;
            ch++ ; // - this coz it went to line 10
        }
        System.out.println(Arrays.toString(letters));


}
}