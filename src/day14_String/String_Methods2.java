package day14_String;

public class String_Methods2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java" , "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "rossboss@yahoo.com";
        email = email.replace("yahoo.com" , "gmail.com");
        System.out.println("email = " + email); // gmail

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", ""); //" Java Java   C# c# C++ C++"

        sentence2 = sentence2.replace("   ", " ");
        System.out.println("sentence2 = " + sentence2);





















    }
}
