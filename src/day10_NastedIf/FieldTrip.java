package day10_NastedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int grade = 4;
        String location = "";
        int groupNumber = 0;
        String teacher = "";

        if (grade >= 1 && grade <= 6) {

            if (grade == 1){
            location = "Apple Orchard";
            groupNumber = 3;
            teacher = "Ms. Smith";
            } else if (grade == 2){
                location = "zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3){
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Ms. Wilson";
            } else if (grade == 4){
                location = "Movie theater";
                groupNumber = 7;
                teacher = "Mr. Robinson";
            }


            }else {
            System.out.println("Invalid Number");
        }
        System.out.println("location - " + location+"\ngroupNumber = " + groupNumber+"\nteacher = " + teacher);



        /*
                System.out.println("Loc - Apple Orchard");
                System.out.println("num of groups 3 ");
                System.out.println("teacher - Ms. Smith ");
         */








    }
}
