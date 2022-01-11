package top17;

public class MaxMinNumberArray {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        System.out.println(max(arr1));
        System.out.println(min(arr1));


    }

    public static int max(int[]array){
       int max = array[0];

        for (int i = 0; i < array.length; i++) {
            int each = array[i];
            if (each>max){
                max=each;
            }
        }
        return max;
    }
    public static int min(int[]array){

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            int each = array[i];
            if (each<min){
                min=each;
            }

        }
        return min;

    }


}
