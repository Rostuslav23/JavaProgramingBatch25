package day36_Inheritance.Sport;

public class BasketBall extends Sport{

    public int differentZoneToScore;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefere, String rules,int differentZoneToScore) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
        this.differentZoneToScore = differentZoneToScore;

    }

    public String toString() {
        return "BasketBall{" +
                "differentZoneToScore=" + differentZoneToScore +
                ", name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfRefere +
                ", rules='" + rules + '\'' +
                '}';
    }

}
