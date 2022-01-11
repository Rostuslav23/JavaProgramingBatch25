package day14_String;

import java.util.Locale;

public class String_Methods5 {
    public static void main(String[] args) {

        String str = " ";

        boolean r = str.isEmpty();

        System.out.println(r);

        boolean r1 = str.isBlank();

        System.out.println(r1);

        System.out.println("============================================================================");

        String s1 = "Cydeo";
        String s2 = "cydeo" ;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2)); // true


        System.out.println("yEs.".equalsIgnoreCase("Yes"));

        System.out.println("============================================================================ contains" );


        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("java") || sentence.contains("Java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("============================================================================");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false

        System.out.println(input1.contains("Java")); // false

        System.out.println(input1.toLowerCase().contains("java"));//true
        System.out.println(input1.toUpperCase().contains("JAVA"));//true








    }
}
