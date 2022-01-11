package day36_Inheritance.Phone;

public class PhoneObject {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.setInfo("Iphone","13 Pro Max",256,"blue",1350);
        iphone.faceTime(8503584201L);
        iphone.faceTimeEmail("qwe@gmail.com");
        iphone.call(8503584201L);
        iphone.text(8503584201L);

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung","S 15",128,"White",1200);
        samsung.freeze();
        samsung.call(8503455421L);

        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia","x 2022",64,"Black",999);
        nokia.selfDefense();
        nokia.text(8901235566L);


    }



}

		/*
		1.5 Create a class named Phone Objects and test of the sub class' objects
        */



