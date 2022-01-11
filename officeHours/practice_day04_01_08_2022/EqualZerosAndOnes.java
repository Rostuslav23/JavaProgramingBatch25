package practice_day04_01_08_2022;

public class EqualZerosAndOnes {

    public static void main(String[] args) {

    /*
    Q3:
       - Given an array [1,1,1,0,1,0], after how many moves you need to make it equal the number of 0s and 1s
       - it should be given even length of Array
       Expected output:1
     */
        int[] array = {1,1,1,0,1,0};
        int countZero = 0;
        int countOnes = 0;
        int moves ;


        for (int i : array) {
            if(i == 1){

            countOnes++;
            }else {
            countZero++;
            }
        }
        System.out.println("1   -  "+countOnes);
        System.out.println("0   -  "+countZero);

        if (countOnes < countZero){
            moves = (countZero - countOnes)/2;
        }else {
            moves = (countOnes - countZero)/2;
    }
        System.out.println("moves = " + moves);


        System.out.println("Math.abs(-2) = " + Math.abs(2));
        System.out.println(Math.abs(countZero-countOnes)/2);
    }}
