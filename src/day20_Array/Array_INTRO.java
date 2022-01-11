package day20_Array;

import java.util.Arrays;

public class Array_INTRO {

    public static void main(String[] args) {

        // create a variable that's capable enough to contain 5 names

        String [] myGroup = new String[5] ;  // or String myGroup [] ;  0 - 4
        myGroup [0] = "Anastasia";
        myGroup [1] = "Hulya";
        myGroup [2] = "Mert";
        myGroup [3] = "Turan";
        myGroup [4] = "Irina";
        //myGroup [5] = "Irina2"; you cant reduce or increase the value .



        // System.out.println(myGroup); hashcode - this is WRONG

        System.out.println(Arrays.toString(myGroup));  // ["Anastasia", "Hulya", "Mert", "Turan", "Irina"]

        System.out.println("============================================================");

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//                             0        1           2            3          4        5             6
        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number <1 || number >7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);












    }
}
