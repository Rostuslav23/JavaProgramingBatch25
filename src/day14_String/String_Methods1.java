package day14_String;

public class String_Methods1 {
    public static void main(String[] args) {

        String str1 = "     batch 25      ";
        str1 = str1.trim(); // " batch 25"

        System.out.println(str1);

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");

        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming language";

         int n3 = str3.indexOf("an");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("gua");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");

        System.out.println("n5 = " + n5);

        System.out.println("=========================================================");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");  // 1 A
        System.out.println("firstA = " + firstA);

        int secondA = s.indexOf("a "); // 2 A
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C"); // 3 A
        System.out.println("thirdA = " + thirdA);

        // int forthA = s.indexOf("ava W"); // 4 A
        // int forthA = s.lastIndexOf("av"); // 4 A
        int forthA = s.indexOf("Ca") + 1;   // 4 A
        System.out.println("forthA = " + forthA);

        int lastA = s.lastIndexOf("a"); // LAST A //
        System.out.println("lastA = " + lastA);

        //  int fifthA = s.lastIndexOf("va") + 1;  // 5A
        int fifthA = s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);

        int sixA = s.lastIndexOf("aw"); // 6 A
        System.out.println("sixA = " + sixA);

       //  int seventhA = s.lastIndexOf("a o"); //  7 A
        int seventhA = s.lastIndexOf("a ");
        System.out.println("seventhA = " + seventhA);













    }
}
