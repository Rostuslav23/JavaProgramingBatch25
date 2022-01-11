package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {


        String firstName = "Cydeo";
        String lastName = "School";
        int age = 23;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100_000.58;


        String fullName = firstName + " " + lastName;


        // ful name of the person is

        System.out.println("Full name of the person is " + fullName);


        // ___ is __ years old

        System.out.println(fullName + " is " + age +" years old");


        //FullName is JobTitle, works at CompanyName, and FullName' salary is Salary.

        System.out.println(fullName + " is " +jobTitle + ", " + "works at " + companyName + ", " + "and " + fullName + "," + salary  + " is Salary" );

    }
    }
