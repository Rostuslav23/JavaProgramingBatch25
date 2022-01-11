package day15_ForLoop;

public class ForLoop3 {
    public static void main(String[] args) {
        // A~Z
        // a-z
        //Z~A
        //z~a

        for (char i = 'a'; i <= 'z'; i++){ // i : is representing for a - z
            System.out.print(i+ " ");
        }
        System.out.println();

        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i+" ");
        }

/* for (int i = 65; i <= 90 ; i++){
   System.out.println((char)i+" ");
    }
*/

        System.out.println();
        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i+ " ");
        }

        System.out.println();
        for (char i = 'z'; i >= 'a'; i--){
            System.out.print(i+ " ");
        }

        System.out.println();

        System.out.println("__________________________________________________-");

        // for (char i = 1; i <= 40000; i++){
         //   System.out.print(i+" ");
       //  }


















    }
}
