package day20_Array;

public class Array_From_Z_to_A2 {

    public static void main(String[] args) {

        char [] alphabets = new char [26]; // Z-A

        for (char i = 0 , j = 'Z'; i < alphabets.length; i++, j--){
            alphabets [i] = j ; // j : represent CHARACTERS, i: INDEX number
        }




    }
}
