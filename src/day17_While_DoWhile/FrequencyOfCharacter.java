package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {
        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0 ;  // +1+1+1 ---> 3

        for (int i = 0; i < str.length() ; i++) { // i : index  of str
            char eachChar = str.charAt(i);       //eachChar : each cherecter of the str.

            // 'A'  == 'A'
            if (ch == eachChar){ // if given ch is matching with the eachChar ,the ch is appeared in the string
                frequency++;
              // frequency += 1;
        }
        }

            System.out.print(frequency);



    }
}
/*
1. Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding
 */