package day21_ForEachLoop;

public class Unique_Elements {

    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        // for each LOOp

        for (String each : words) {//outer Loop each: every element in ARRAY "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
            int count = 0 ;
            for (String element : words) {//inner LOOP element: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
                if (element.equals(each)){
                    count++;
                }
            }

            if (count == 1){
                System.out.println(each);
            }
        }
    }
}
