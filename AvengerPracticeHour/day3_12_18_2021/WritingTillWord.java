package day3_12_18_2021;

public class WritingTillWord {
    public static void main(String[] args) {

        String word = "Code";
//                     0123
/*       String c = word.substring(0,1);
        System.out.println("c = " + c);
        String co = word.substring(0,2);
        System.out.println("co = " + co);
        String cod = word.substring(0,3);
        System.out.println("cod = " + cod);
        String code = word.substring(0,4);
        System.out.println("code = " + code);

 */


       /*for (int i = 1; i < word.length() ; i++) {   - is wrong
            String tem = word.substring(0,i);
           System.out.print(tem);

        */
        for (int i = 0; i <=word.length() ; i++) {
            String tem=word.substring(0,i);
            System.out.print( tem);
       }





    }
}
/*
                                Given a non-empty string like "Code" print a string like below output.
                                (do with substring  first)
                                Code → "CCoCodCode"
                                abc → "aababc"
                                ab → "aab"
                                (do with replaceFirst())
                                Code → "C-Co-Cod-Code"
                                abc → "a-ab-abc"
                                ab → "a-ab"
 */
