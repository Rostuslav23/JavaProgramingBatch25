package day2_12_11_2021;

public class String_Without_X_First_Last {

    /**
     * 3.
     * Given a string, if the first or last chars are 'x', print the string without those 'x' chars,
     * and otherwise print the string unchanged.
     * (do with for loop)
     * <p>
     * <p>
     * input :"xHix" → "Hi"
     * input :"xHi" → "Hi"
     * input :"Hxix" → "Hxi"
     */
    public static void main(String[] args) {
        String word="Hellox";
        String temp="";
        //0123
        // input:  "xHix" → Hi
        //012
        //   input :"xHi" → Hi
        //0123
        //   input :"Hxix" → Hxi
        if (word.charAt(0)=='x'&&word.charAt(word.length()-1)=='x'){
            for (int i = 1; i <word.length() -1; i++) {
                temp+=word.charAt(i);
            }
        }else if (word.charAt(0)=='x'){
            for (int i = 1; i <word.length() ; i++) {
                temp+=word.charAt(i);
            }
        }
        //0123
        //   input :"Hxix" → Hxi
        else if (word.charAt(word.length()-1)=='x'){
            //2   //3
            for (int i = 0; i <word.length() -1; i++) {
                temp+=word.charAt(i);
            }
        }

        System.out.println("temp = " + temp);


        System.out.println("----------------------------------------------");

        String word2 = "xHellox";
        String resul2 = "";

        resul2 = word2.substring(1,word2.length()-1);

        System.out.println("resul2 = " + resul2);


    }
}