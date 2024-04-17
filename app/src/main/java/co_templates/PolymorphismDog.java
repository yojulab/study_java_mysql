package co_templates;

public class PolymorphismDog extends PolymorpyismAnimal {
    // public void animalSound() {
    // System.out.println("The dog says: bow wow");
    // }
    public int speed(int kmeter){
        int result = (int) (kmeter * 100);
        return result;
    }
}
