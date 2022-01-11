package day20_Array;

public class Arrays_Finding_Max_Number {

    public static void main(String[] args) {

        int [] numbers = { 10, 5 , 4 ,20 , 1 , 0};

        int max = numbers[0]; // 10

        // shortcut numbers.fori  -- > from INDEX_0
        // numbers.forr   - reversed !

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){ // if there is element in the array thats greater than the current max number
            max = numbers[i]; // assigning greater number to variable max
            }
            // THAT'S AN APPROACH TO FIND A MAXIMUM NUMBER
        }

        System.out.println(max+"is a maximum number");
    }
}
