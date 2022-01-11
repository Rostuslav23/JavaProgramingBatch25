package day2_12_11_2021;

public class EncryptPassword {

    public static void main(String[] args) {

             /*  5.
                *                 Given a string password. Encrypt with "x" a given password
                *                 and print.
                *                 (do with for loop)
                *                 password: cydeo
                *                 encrypt with char :x
                *                 output:cxyxdxexox
                */

        String password = "cydeo";
        char encrypWithChar = 'x';
        String encryotedPassword = "";

        for (int i = 0; i < password.length(); i++) {
            encryotedPassword += ""+ password.charAt(i)+ encrypWithChar;
        }

        System.out.println("encryotedPassword = " + encryotedPassword);
    }
}
