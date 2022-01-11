package day24_CostumMethod_Return;

public class ReturnMethod {

    public static void main(String[] args) {

        //fin the max number between 100 & 200
       int maxNumber = max(100,200);

        System.out.println(maxNumber);

        // multiply the max number by 2

        int multiplicaton = maxNumber * 2;

        System.out.println(multiplicaton);


    }


    public static int max (int a , int b ){

        int result = 0;

        if (a > b ){
            result = a;
        }else {
            result = b;
        }

        return result;
    }

}
