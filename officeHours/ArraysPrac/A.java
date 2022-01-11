package ArraysPrac;

import jdk.swing.interop.SwingInterOpUtils;

public class A {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------ task1");

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] array : items) {
            for (String elements : array) {
                System.out.print("\t" + elements);

            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------ task2");

        for (String[] array1 : items) {
            for (int i = array1.length - 1; i >= 0; i--) {
                System.out.print("\t"+ array1[i]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------ task3");
        /*
         print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
         */
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length ; j++) {
                System.out.print("\t"+ items[i][j]);
            }
            System.out.println();
            }
        System.out.println("------------------------------------------------------ task4");


        }

        }


/*
 Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};
 */


