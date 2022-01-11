package day37_Inheritance.animal_task;

public class AnimalObject {

    public static void main(String[] args) {

    Dog dog = new Dog("Goggi","Corgie",'M',1,"Midium","Black");
        System.out.println(dog);
        dog.bark();

    Cat cat = new Cat("Marsik","Siamese",'F',2,"Large","White");
        System.out.println(cat);
        cat.scrathch();

    Parrot parrot = new Parrot("King","Macaw",'M',3,"Small","Orange");
        System.out.println(parrot);
        parrot.sing();
    }
}