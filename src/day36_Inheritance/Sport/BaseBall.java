package day36_Inheritance.Sport;

import java.security.PublicKey;

public class BaseBall extends Sport {

    public String pitcher,catcher;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefere, String rules,String pitcher,String catcher) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
        this.catcher = catcher;
        this.pitcher = pitcher;
    }

    public String toString() {
        return "BaseBall{" +
                "pitcher='" + pitcher + '\'' +
                ", catcher='" + catcher + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfRefere +
                ", rules='" + rules + '\'' +
                '}';
    }


    public void homerun(){
        System.out.println(name+" scoring homerun");
    }
}

