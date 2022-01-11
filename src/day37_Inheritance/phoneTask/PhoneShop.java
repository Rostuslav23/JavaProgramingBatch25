package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {


        Iphone iphone = new Iphone("Iphone","13 Pro Max","256",1350,"Blue");
        Samsung samsung = new Samsung("Samsung","S-15","128",1200,"Black");
        Nokia nokia = new Nokia("Nokia","Brick","64",50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123);
        iphone.faceTime(123);
        iphone.faceTime("yahoo@gmail.com");


        System.out.println("-----------------------------------------");
        samsung.call(123231);
        samsung.text(123);
        samsung.freeze();

        System.out.println("-----------------------------------------");
        nokia.call(123231);
        nokia.text(123);
        nokia.selfDefense();

        System.out.println("-----------------------------------------");
        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);
        
        

    }
    
    
}
