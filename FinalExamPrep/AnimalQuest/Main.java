package AnimalQuest;

public class Main {
    public static void main(String[] args) {

        // Fish fish = new Fish();
        // fish.swim();
        // fish.move();
        Flyable f = (Flyable) new Fish();
        f.fly();
        // Duck duck = new Duck();
        // duck.swim();
        // duck.fly();
        // duck.move();
    }
}
