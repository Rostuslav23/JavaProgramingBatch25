package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2Arrays<arr1> {

    public static void main(String[] args) {



    int [] arr1 = {1,2,3,4,5};

    ArraysUtility.printEachElement(arr1);

        System.out.println("---------------------------------");

    double[] arr2 = {1.5,2.5,3.5,4.5};
   ArraysUtility.printEachElement(arr2);

        System.out.println("---------------------------------");

   char[] arr3 = {'A','B','C','D'};

   ArraysUtility.printEachElement(arr3);

   String [] arr4 = {"Hello", "motherfuckers", "hola"};

   ArraysUtility.printEachElement(arr4);

        System.out.println("---------------------------------");




}
}