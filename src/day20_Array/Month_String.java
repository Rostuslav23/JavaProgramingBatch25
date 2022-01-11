package day20_Array;

import java.util.Arrays;

public class Month_String {

    public static void main(String[] args) {

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//                        1          2             3       4        5     6      7       8          9         10          11            12
        System.out.println(Arrays.toString(month)); // 0 - 11 ;last index.  (lenght-1)

        int number = 1;

        if (number < 1 || number > 12) {
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(month[number - 1]);
        System.out.println("-------------------------------------------------------------------------------");
/*
        System.out.println(month[0]); // January
        System.out.println(month[1]); // February
        System.out.println(month[2]); // March
        System.out.println(month[3]); // April
        System.out.println(month[4]); // May
        System.out.println(month[5]); // June
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);

 */
                    // i : represent the index number of array starting from 0
        for (int i = 0; i < month.length; i++) {  // or for (int i = 0 ; i < 12; i ++ ){...}
            System.out.println(month[i]);
        }

        System.out.println("-------------------------------------------------------------------------------");

        for(int i = month.length-1; i >= 0; i--  ){//i: represents the index numbers of array starting from last index
            System.out.println(month[i]);
        }





    }

}