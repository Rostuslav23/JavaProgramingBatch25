package day33_Statics;

import java.io.OutputStream;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public double price;

    public static String OS = "iOS";

    public String color;

    public String size ;

    public String madeIn = "China";

    public static boolean hasBattert = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;

    public static void printOperatingSystem(){
        System.out.println(OS);
    }

   // public static void prinModelAndProce(){
     //   System.out.println(model+" : "+price);// static methods does not accept instances


    public void method1(){
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }
}
