package practice_day02_IF_LooP;

public class Animals_Switch_Statement {
    public static void main(String[] args) {

        /* Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER   - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal */

     String animal = "CAT";
     String result = "";

     switch (animal){

         case "DOG":
         case "CAT":
             result = "Domestic animal";
             break;

         case "Tiger":
             result = "wild animal";
             break;

         default:
             result = "unknown animal";
             break;
     }
        System.out.println(result);
    }
}
/*
        System.out.println("Enter animal: ");
        String animal = scan.next();

        String result = "";

        switch (animal) {
            case "DOG":
            case "CAT":
                result = "Domestic animal";
                break;
            case "TIGER":
                result = "Wild animal";
                break;
            default:
                result = "Unknown animal";
        }
        System.out.println(result);
    }
 */
