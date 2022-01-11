package day26_CostumMethodsPractice;

import com.sun.tools.attach.AgentInitializationException;

public class CostomMethod_Even_OddNumbers {

    public static void main(String[] args) {

        evenNumbers();
        System.out.println();
        System.out.println();
        oddNumbers();
        System.out.println();
        System.out.println();
        eligibleToBuyAlc(21);
        System.out.println();
        eligibleToVote(20, "us");
        System.out.println();
        gradeCalculator('A');
        System.out.println();
        areaOfCircle(2.3);
        System.out.println();
        areaOfSquare(3.2);
        System.out.println();
        dollarToEuro(10);
        System.out.println();
        kgToLb(6.0);

    }


    // create a method that can print even numbers between 1~100 in a same line separated by space


    public static void evenNumbers() {

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }

    // create a method that can print odd numbers between 1~100 in a same line separated by space

    public static void oddNumbers() {

        for (int i = 1; i < 100; i += 2) {

            System.out.print(i + " ");

        }
    }

    //  create a method that can check if a person is eligible to buy alcohol

    public static void eligibleToBuyAlc(int age) {

        if (age >= 21) {
            System.out.println(age + " is able to buy Alcohol");
        } else {
            System.out.println(age + " is not able to buy Alcohol");
        }


    }

    /*
    create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
     */

    public static void eligibleToVote(int age, String citizen) {
        if (age >= 21 && citizen.equalsIgnoreCase("USA")) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }
    }

    // create a method that can calculate the grade of the student based on the score

    public static void gradeCalculator(int score) {
        if (score >= 50 && score <= 100) {
            char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
            System.out.println("grade = " + grade);
        } else {
            System.out.println("Invalid score");
        }
    }

    // create a method that can calculate the area of a circle

    public static void areaOfCircle(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("area = " + area);
    }

    //create a method that can calculate the area of a square

    public static void areaOfSquare(double oneSideLength) {
        double squareArea = oneSideLength * oneSideLength;
        System.out.println("squareArea = " + squareArea);

    }

    // create a method that can can convert dollar to euro

    public static void dollarToEuro( double dollar){

        double euro = 0.89 * dollar ;
        System.out.println(dollar + " USD = " + euro + " EUR");
    }

    // create a method that can convert kg to lb

    public static void kgToLb (double kg){

        double lb = 2.2 * kg ;
        System.out.println("kg to lbs "+ lb);
    }
}
