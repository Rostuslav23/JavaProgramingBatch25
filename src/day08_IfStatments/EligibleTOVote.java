package day08_IfStatments;

public class EligibleTOVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age =38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";  // true

        // Eligible

        if  (isEligible){
            System.out.println("Eligible");
        }

        // Not Eligible

        if(!isEligible){
            System.out.println("Not Eligible");
        }


    }
}