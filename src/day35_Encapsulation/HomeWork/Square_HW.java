package day35_Encapsulation.HomeWork;

public class Square_HW {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            return;
        }
        this.side = side;
    }

    public Square_HW(double side,double side2 ) {
        if (side == 0 || side2 == 0){
            System.err.println("Wrong side"+ side);
            System.exit(0);
        }
        this.side = side;
    }
    public static void calcArea(double side,double side2){
        double area = side * side2;
        System.out.println(area);
        return;
    }
}
/*
1. Square Task:
		1.1 Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields

					Condition:
						side of the square should not be negative

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)

				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when object is passed in print statement
 */
