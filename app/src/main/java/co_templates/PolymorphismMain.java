package co_templates;

public class PolymorphismMain {
    public static void main(String[] args) {
        PolymorpyismAnimal animal = new PolymorpyismAnimal();
        animal.animalSound();

        PolymorpyismPig pig = new PolymorpyismPig();
        pig.animalSound();

        PolymorphismDog dog = new PolymorphismDog();
        dog.animalSound();
        dog.speed(3);
        return;
    }
}
