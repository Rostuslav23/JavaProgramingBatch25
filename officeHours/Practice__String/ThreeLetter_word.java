package Practice__String;

import java.util.Scanner;

public class ThreeLetter_word {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three words:");
        String word = scan.nextLine();
        int wordLenght = word.length();
        char letter = word.charAt(1);

        if (word.length() == 3) {
            if (letter == 'a') {
                System.out.println("Cool world");
            } else{
                System.out.println("Okay world");
            }
        } else if( word.length() < 3){
            System.out.println("Too short");
        } else{
            System.out.println("Too long");
        }
        scan.close();

        }}


/*
4. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
 */
