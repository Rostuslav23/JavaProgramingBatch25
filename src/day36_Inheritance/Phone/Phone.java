package day36_Inheritance.Phone;

public class Phone {

    public String brand, model,color;
    public int price;
    public int size;

    public void setInfo(String brand, String model, int size, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    public void call(long phoneNumber){
        System.out.println(phoneNumber + " is calling");
    }

    public void text(long phoneNumber){
        System.out.println(phoneNumber + " is texting");
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */