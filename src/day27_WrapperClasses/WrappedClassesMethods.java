package day27_WrapperClasses;

public class WrappedClassesMethods {

    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str); // int

        System.out.println(num + 1); // 124
        System.out.println(str + 1); // 1231

        String str2 = "10.5" ;

        double num2 = Double.parseDouble(str2); // double

        System.out.println(num2 + 1);

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("maxInt = " + maxInt);
        System.out.println("minInt = " + minInt);

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;

        System.out.println("maxLong = " + maxLong);
        System.out.println("minLong = " + minLong);

        String s1 = "true";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println("r1 boolean= " + r1);

        System.out.println("---------------------------------------------");

        String s2 = "123";
        int xInt = Integer.valueOf(s2); // Integer
        int yInt = Integer.valueOf(s2);// Integer

        System.out.println("xInt = " + xInt);
        System.out.println("yInt = " + yInt);

        String s3 = "1.5";
        Double zDouble = Double.valueOf(s3);

        System.out.println("zDouble = " + zDouble);

        System.out.println("-------------------------------------------------------------------");

        // isDigit()

        char ch = '!';
//                           isDigit
        boolean r2char = Character.isDigit(ch);
//                           isLetter
        boolean r3char = Character.isLetter(ch);
//                           isLetterOrDigit
        boolean r4char = !Character.isLetterOrDigit(ch); // ! is not
//                           isisUpperCase
        boolean r5char = Character.isUpperCase(ch);
//                           isisLowerCase
        boolean r6char = Character.isLowerCase(ch);


        System.out.println("r2char = " + r2char);
        System.out.println("r3char = " + r3char);
        System.out.println("r4char = " + r4char);
        System.out.println("r5char = " + r5char);
        System.out.println("r6char = " + r6char);

        System.out.println("--------------------------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0 ;

        for (char each : s.toCharArray()) {

            if (Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum);

    }

}
