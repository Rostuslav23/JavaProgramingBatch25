package day35_Encapsulation.HomeWork;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid item name");
            System.exit(0);
        }
        for (int i = 0; i < name.length(); i++) {
            if (!((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')
                    || name.charAt(i) == ' ')) {
                System.err.println("Item name has invalid characters");
                System.exit(0);
            }
        }
        if(!(Character.isLetter(name.charAt(0)))){
            System.err.println("Item name should start with letter");
            System.exit(0);
        }

        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            return;
        }
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            return;
        }
        if (name.equalsIgnoreCase("toilet paper")) {
            quantity = 1;
        }
        this.quantity = quantity;
    }


    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }


    public double calcCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }


    public static void main(String[] args) {


        Item item1 = new Item("banana", 12, 10);
        System.out.println(item1);
    }
}
/*
4. Item Task
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */