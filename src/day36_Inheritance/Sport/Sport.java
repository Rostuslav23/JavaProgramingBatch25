package day36_Inheritance.Sport;

public class Sport {

    public String name;
    public int numberOfPlayers,numberOfRefere;
    public String rules;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefere, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfRefere +
                ", rules='" + rules + '\'' +
                '}';
    }
    public void play(){
        System.out.println(name + " are playing");
    }
    public void training(){
        System.out.println(name + " is training");
    }
}
/*
1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfRefere, rules



			methods:
				setInfo()
				play()
				toString(
 */
