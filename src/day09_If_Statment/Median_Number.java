package day09_If_Statment;

public class Median_Number {
    public static void main(String[] args) {
    /* 2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
            Ex:
                a = 10, b= 15, c = 20;
            Output:
                15 is the median number

 */
 int a = 10, b = 15, c = 20;

 // if we have 3 DIFFERENT NUMBERS , one MUST be MAXIMUM number ,and other one  is MINIMUN, then 3d one is MEDIUM NUMBER

 //                    a=15, b=10 , c=20    a=15 c=10  b=20     = "a" IS THE MED NUMBER
 // 1 if c is MAXIMUM number & b is the MINIMUM NUMBER , then a is the MEDIAN number
// 2. if b is MAXIMUM number & c is the MINIMUM NUMBER , then a is the MEDIAN number

 boolean aCanBeMed = ( a > b && a < c) || ( a > c && a < b);
//                 b=15   a=20   c=10       b=15   a =10  c=20  = "b" IS THE MED NUMBER
 boolean bCanBeMed = (b > c && b < a) || (b > a && c < b);
//                                                            = "c" IS THE MED NUMBER
 boolean cCanBeMed = !aCanBeMed && !bCanBeMed;

 if (aCanBeMed){// if a is a median number
     System.out.println(a + " Is  medium Number");
 }

if (bCanBeMed){        // if b is a median number
    System.out.println( b + " Is  medium Number");
}

if (cCanBeMed){          // if c is a median number
    System.out.println(c + " Is the medium number");
        }










    }
}
