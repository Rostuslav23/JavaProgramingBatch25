package practice_day01;

public class PatientInfo {
    public static void main(String[] args) {

        String name = "Ross";
        int age = 23;
        char gender = 'M';
        boolean isMarried = true ;
        String dateOfBirth = "10.12.13";
        String phoneNumber = "(123)-123-1233";
        boolean haveInsurance = true;
        String insuranceNum = "123-12354-5A";
        String Employer = "Cydeo";
        double copayWithInsurance = 20.0;
        double copayWithoutInsurance = 250.00;

        System.out.println("=== ESCAPE SEQUENCES === ");



        System.out.println("\tname: "+name+"\n\tage: "+age+"\n\tgener: "+gender);

        if (haveInsurance){
            System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);

        } else{
            System.out.println("copayWithoutInsurance = " + copayWithoutInsurance);
        }


    } }
/*
                         1. name (String)
                         2. age (int)
                         3. gender (char)
                         4. date of birth (String)
                         5. isMarried (boolean)
                         6. phone number (String)
                         7. havingInsurance (boolean)
                         8. Insurance number (String)
                         9. Employer (String)
                        10. copayWithInsurance (double)
                        11. copayWithoutInsurance (double)
 */
