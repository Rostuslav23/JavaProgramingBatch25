package day36_Inheritance.Sport;

public class SportObject {

    public static void main(String[] args) {

        Football football = new Football();
        football.setInfo("MU",11,5,"Only Goal keeper can touch a ball with hands","Buffon");
        football.play();
        football.goalScore();

        System.out.println();

        BaseBall baseBall = new BaseBall();
        baseBall.setInfo("LA",8,3,"You cant touch a ball with your legs","Jake","Brawn");
        baseBall.homerun();
        System.out.println(baseBall);

        System.out.println();

        BasketBall basketBall = new BasketBall();
        basketBall.setInfo("Lakers",6,4,"You cant touch a ball with your legs",321);
        basketBall.play();
        basketBall.training();

        System.out.println();

        AmericanFootball americanFootball = new AmericanFootball();
        americanFootball.setInfo("Chicago Bulls",10,5,"No biting","Tom Brandie");
        americanFootball.play();
        americanFootball.training();
        americanFootball.touchDown();
        System.out.println(americanFootball);

    }
}
