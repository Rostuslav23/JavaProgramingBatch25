package practice_day05;

public class Earth {
    public static void main(String[] args) {
        AnimalSpecies dogs = new AnimalSpecies();
        dogs.growthRate = 10;
        dogs.name = "dogs";
        dogs.population = 50;
        
        dogs.setInfo("dogs",10,50);

        System.out.println(dogs.getGrowthRate());
        System.out.println("dogs.getName() = " + dogs.getName());
        System.out.println("dogs.getPopulation() = " + dogs.getPopulation());

    }
}
