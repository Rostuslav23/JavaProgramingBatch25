package day30_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("VW","Jetta","Black",2013,6000.00);
        System.out.println(car1);

        car1.start();
        car1.drive();
        car1.stop();

        System.out.println("car 2 For R-------------------------------------------------------------------");

        Car car2  = new Car();
        car2.setInfo("Mercedes","C-300","White",2022,50000.00);

        System.out.println(car2);


        System.out.println("car 3 for L -------------------------------------------------------------------");

        Car car3 = new Car();
        car3.setInfo("BMW","X6","Black",2022,65000.00);

        System.out.println(car3);

        Car [] cars = {car1 ,car2 ,car3 };

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3))  ;

        for (Car each : carsList){
            System.out.println(  each.brand + " : "+ each.price  );
        }
        System.out.println("----------------------------------------");
        /*
        BMW 2005 - 2008
        Toyota 1995 - 1997
         */

        carsList.removeIf(p-> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf(p->p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);

    }
}
