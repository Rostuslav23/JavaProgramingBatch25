package day26_CostumMethodsPractice;

import utilities.ArraysUtility;

public class ReverseArray2 {

    public static int [] reverse (int[] array){

        int [] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }
}
