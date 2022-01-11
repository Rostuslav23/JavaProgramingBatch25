package day14_String;

public class EmailDomain_SubString {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        // domain:

        int beginningIndex = email.indexOf("@") + 1 ;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain);

        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ");

        String str1 = "Java is fun, Java is cool, I love Java";
        //             012345678910
        String s1 = str1.substring(0,10+1);

        int beg = str1.indexOf(" J")+1;
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(beg,end);

        System.out.println(s1);
        System.out.println(s2);

        String  s3 = str1.substring(str1.lastIndexOf("I"));

        System.out.println(s3);










    }
}
