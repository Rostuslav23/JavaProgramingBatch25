package day11_Switch_Scanner;

public class NamberOfDays {
    public static void main(String[] args) {

        int number =  9, year = 2000;
        String result = "";

        if (number >= 1 && number <=12){ // number : 1 - 12
            switch (number){
                case 2:
                    result = (year % 4 == 0)? "29 Days" : "28days";
                    break;

                case 4: case 6 : case 9 : case 11:
                    result = "30 Days";
                    break;

                default:  // 1, 3 , 5 , 7 , 8 , 10 , 12
                    result = "31 Days";


            }

        }else {
            result ="Invalid Number";
        }

        System.out.println(result);

















    }
}
