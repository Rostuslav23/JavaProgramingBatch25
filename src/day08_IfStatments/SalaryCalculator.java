package day08_IfStatments;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50 ,
            weeklyHours =45;

        double stateTaxRate = 6.5,
        federalTaxRate = 26.2;
// -----------------------------------------------------------------------------------
        int salaryBeforeTax = hourlyRate * weeklyHours * 52 ; // salary is equal to one week salary * 52
        double stateTax = salaryBeforeTax * stateTaxRate / 100 ;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;
// -------------------------------------------------------------------------------------
        System.out.println("Gross pay is : $" + salaryBeforeTax);
        System.out.println("State tax = $ " + stateTax);
        System.out.println("Federal tax = $" + federalTax);
        System.out.println("Total tax = $" + totalTax);
        System.out.println("Net income = $" +salaryAfterTax);





    }






}

// Practice Tasks:
//	1. write a program that can swipe two variables' value by using a temporary variable
//
//		    Ex:
//		        if a= 10, b=15
//
//		    output:
//		        a = 15
//		        b = 10
//
//    2. create a class named LeapYear, and write a program that can identify if the given year is leap Year, print true if it's leap year, otherwise print false
//
//	        Ex:
//	             if  year = 2020
//
//	            output:
//	                2020 is leap year: true
//
//        Hint: if the number of year can be evenly divisible by 4 (with remainder of zero), it's leap year
//
//	3. Create a class called SalaryCalculator.java
//			3.1 declare the following variables:
//					hourlyRate, weeklyHours, stateTax, federalTax
//
//			3.2 use the given info in above variables to calculate the followings:
//					1. salaryBeforeTax
//					2. stateTax
//					3. federalTax
//					4. totalTax
//					5. salaryAfterTax
//
//					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
//
//			3.3 use print statement to print each of the above
//				Ex:
//					   hourlyRate = $50
//					   weeklyHours = 45
//					   stateTax = 6 (given as percentage, you need to convert to decimal)
//					   federalTax = 26 (given as percentage, you need to convert to decimal)
//
//				    output:
//				    	Gross pay is: $117000
//				    	Federal tax is: $30420
//			    		State tax is: $7020
//			    		Total tax is: $37440
//			    		Net income is: 79560

