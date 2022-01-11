package day08_IfStatments;

public class Swap_Two_Varibles_WIth_Temporary_Varible {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
//-----------------------------------
        int c = b; // c= 15;

        b = a; //b= 10
        a = c;
//--------------------------------------
        System.out.println("a = " + a); // 15
        System.out.println("b = " + b); // 10

    }
}



