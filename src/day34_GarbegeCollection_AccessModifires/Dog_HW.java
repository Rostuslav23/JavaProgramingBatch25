package day34_GarbegeCollection_AccessModifires;

public class Dog_HW {

    public String breed,size,color;
    public char gender;
    public byte age;
    public static int numberOfLegs = 4;
    public static int numberOfEyes = 2;
    public static int numberOfWings = 0;
    public static boolean isFriendly = true;

    public Dog_HW(String breed, String size, String color, char gender, byte age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }
    static {
        System.out.println(numberOfLegs);
        System.out.println(numberOfEyes);
        System.out.println(numberOfWings);
        System.out.println(isFriendly);
    }
}


/*
1. Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()

 */