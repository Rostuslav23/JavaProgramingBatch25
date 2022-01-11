package day14_String;

public class String_Replace {
    public static void main(String[] args) {
        String s = "Dog Dog Dog Dog Dog Dog Dog Dog";

        s = s.replace("Dog", "Cat");

        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";

        s2 = s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);

        String s3 = "Java";

        s3 = s3.replace("a","e");  // "Jeve"
        System.out.println("s3 = " + s3);

        System.out.println("=============================================================");

        String result = "Java Java Java";
         result = result.replaceFirst("Java" , "Python");
        System.out.println(result);

        System.out.println("=============================================================");

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#" , "Java");
        System.out.println(result2);

        String result3 = "Java";

        result3 = result3.replaceFirst("va","vo");

        System.out.println(result3);











    }
}
