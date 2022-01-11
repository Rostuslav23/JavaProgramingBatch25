package top17;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "civic";
        String s2 = "";

        for (int i = s1.length()-1; i>= 0;i--){
            s2 += s1.charAt(i)+"";
        }
        System.out.println(s2.equals(s1));
    }
}
// String palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.
