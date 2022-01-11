package practice_01_05_22;

import java.util.ArrayList;

public class HidePasswords {
    public static void main(String[] args) {

        String[] password = {"one","hi","hold"};
        ArrayList<String> hiddenPass = new ArrayList<>();

        for (String each: password) {
            hiddenPass.add(converToStar(each));
        }
        System.out.println(hiddenPass);
    }

    public static String converToStar(String str){
        String star = "";

        for (int i = 0; i <str.length() ; i++) {
            star += "*";
        }
        return star;
    }

}
