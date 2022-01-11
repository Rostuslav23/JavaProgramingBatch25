package day37_Inheritance.phoneTask;

    public class Iphone extends Phone {


        public Iphone(String brand, String model, String size, double price, String color) {
            super("Apple", model, size, price, color);
        }
        public void faceTime(long phoneNumber){
            System.out.println(brand + " " + model + " " + " is having a Face Time with " + phoneNumber);
        }

        public void faceTime(String email){
            System.out.println(brand + " " + model + " is having a Face Time with " + email);
        }
    }
 /*
        Variables:
        brand, model, size, price, color

        Methods:
        call(long phoneNumber)
        text(long phoneNumber)
        faceTime(long phoneNumber)
        faceTime(String email)
        toString()
        */