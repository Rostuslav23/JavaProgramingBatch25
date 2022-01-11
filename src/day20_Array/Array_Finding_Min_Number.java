package day20_Array;

public class Array_Finding_Min_Number {
    public static void main(String[] args) {

        int [] number = { 1, 2 , 0 , 5 , 10};
        int min = number[0]; //0: - 1 we are thinking that's the min NUMBERS

        for (int i = 0; i < number.length; i++) { // i: 0,1,2,3,...
            if (number[i] < min){ // if there is an element in the array that's smaller
                min = number[i]; // smaller number will be assigned to the variable min .
            }

        }
        System.out.println(min+" This is the min number");



    }
}

 /*
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

  */
