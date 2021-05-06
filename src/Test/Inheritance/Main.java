package Test.Inheritance;

public class Main {
    private static void saySomething(Animal[] animals) {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    private static void getAnimalInfo(Animal[] animals){
        for (Animal animal : animals){
        System.out.println("Bread: " + animal.bread);
        System.out.println("Family: " + animal.family);
    }
}

    public static void main(String[] args) {
        Cat cat = new Cat("Persian", "Feline", true);
        Dog dog = new Dog("Labrador", "Wolf", "High");
        Horse horse = new Horse("Arabian", "Herbivores", true);

        Animal[] animals = {cat, dog, horse};
        saySomething(animals);
        getAnimalInfo(animals);

    }
}
