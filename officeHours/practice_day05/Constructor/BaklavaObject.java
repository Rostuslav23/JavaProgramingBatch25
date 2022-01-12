package practice_day05.Constructor;

public class BaklavaObject {
    public static void main(String[] args) {

        BaklavaRecipe baklavaRecipe = new BaklavaRecipe("walnuts");
        baklavaRecipe.price = 40.50;
        baklavaRecipe.amountLB = 2;
        System.out.println(baklavaRecipe);


    }
}
