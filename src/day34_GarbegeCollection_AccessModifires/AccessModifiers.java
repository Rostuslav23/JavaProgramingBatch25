package day34_GarbegeCollection_AccessModifires;

public class AccessModifiers {

    public static int publicData = 100;
    static int defaultData = 200;// accesss modifier : default
    private static int pricateData = 300;

    public static void method1(){
        System.out.println("Publick");
    }

    static void method2(){
        System.out.println("Default");
    }

    private static void method(){
        System.out.println("Privet");
    }


    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(pricateData);
    }
}
