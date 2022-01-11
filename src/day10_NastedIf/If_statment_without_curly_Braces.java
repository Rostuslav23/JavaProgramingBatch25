package day10_NastedIf;

public class If_statment_without_curly_Braces {
    // pre- condition : if there are  only one statement in the block
    public static void main(String[] args) {
        int number = 12;
        String result = "";

        if (number >= 1 && number <= 12) { // if number is valid 1-12
            if (number == 1)         // only using asigning right data
                result = "January";
            else if (number == 2)
                result = "February";
            else if (number == 3)
                result = "March";
            else if (number == 4)
                result = "Arpil";
            else if (number == 5)
                result = "May";
            else if (number == 6)
                result = "June";
            else if (number == 7)
                result = "July";
            else if (number == 8)
                result = "August";
            else if (number == 9)
                result = "September";
            else if (number == 10)
                result = "October";
            else if (number == 11)
                result = "November";
            else
                result = "December";





            }
        }
    }

