package top17;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        String[]str1 ={"I","love","java"};
        System.out.println(Arrays.toString(reverse(str1)));

    }



    public static String[] reverse(String [] str){

        String[] newarray = new String[str.length];

        int j = str.length-1 ;
        for (int i = 0; i <= str.length-1 ; i++,j--) {

            newarray[j] = str[i];

        }
        return newarray;

    }
}
