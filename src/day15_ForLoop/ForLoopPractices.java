package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        // 1 - 50

        //  for (int i = 1; i<=10; i ++){

        for (int i = 15; i <= 45; i ++){  // 15, 16 , 17 - 45
            System.out.print(i+ " ");
        }

        System.out.println();



        for (int i = 100; i >= 50; i --){  // i:100 , 99 ,98, - 50
            System.out.print(i+ " ");
        }

        System.out.println();

        System.out.println("++_____________________________________________________________________________________++");

        for ( int i = 1; i <=  55; i++){
            if (i %2 == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println("");
        System.out.println("++_____________________________________________________________________________________++");

        // print all the even numers between 1 - 55 : 2,3,4,5,6 -54

        for (int i = 2 ; i <=54 ; i +=2){  // i: 2,4,6,,8,10- 54
            System.out.println(i + " ");
        }











    }
}
