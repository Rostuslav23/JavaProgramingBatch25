package day36_Inheritance.Phone;

public class Iphone extends Phone {

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber + " is faceTiming");
    }
    public void faceTimeEmail(String email){
        System.out.println(email+" you got a new email");
    }

}
/*

		1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */