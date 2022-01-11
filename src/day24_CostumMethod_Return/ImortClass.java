package day24_CostumMethod_Return;

public class ImortClass {

    public static void main(String[] args) {

        String str = "aaaaaaaaaabbbbbbbbbbbccccccccccc";

        str = ReturnMethod4.removeDuplicates(str);

        System.out.println(str);

        String name = "Java Programming";

        name = ReturnMethodIntro.reverse(name);

        System.out.println(name);
    }
}
