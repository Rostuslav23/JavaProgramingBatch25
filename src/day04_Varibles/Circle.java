package day04_Varibles;

public class Circle {
    public static void main(String[] args) {
        // Pi,radius, diametr, area, perimeter

        double radius = 10;

        double PI = 3.14;
        double diametr = radius * 2;  // finds the diameter by multiplaying to 2 !
        double area = radius * radius * PI;   //finds the area by are of the circle !
        double perimetr = diametr * PI;  // finds a peremiter if the circle !


        System.out.println("radius = " + radius);
        System.out.println("diametr = " + diametr);
        System.out.println("area = " + area);
        System.out.println("perimetr = " + perimetr);


    }



}
/*3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI

 */