package day36_Inheritance.Sport;

public class AmericanFootball extends Sport{

    public String kicker;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefere, String rules,String kicker) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
        this.kicker = kicker;
    }

    public String toString() {
        return "AmericanFootball{" +
                "kicker='" + kicker + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfRefere +
                ", rules='" + rules + '\'' +
                '}';
    }

    public void touchDown(){
        System.out.println(name+" scoring a touch down ! ");
    }
}
