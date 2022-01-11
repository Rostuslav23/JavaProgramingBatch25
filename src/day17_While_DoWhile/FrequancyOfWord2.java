package day17_While_DoWhile;

public class FrequancyOfWord2 {
    public static void main(String[] args) {

        String str = "Cat Cat Dog Dog cAt CAT caT";

        int frequency = 0 ;

        for (int i = 0; i <= str.length()-3; i++) {  // i: 0,1,2,3,4    -4 depens of the lence of the word
            String eachSub = str.substring(i, i+3);
            //  System.out.println(eachSub);

            if (eachSub.equalsIgnoreCase("Cat")){
                frequency++;
            }
        }

        System.out.println(frequency);








    }
}
