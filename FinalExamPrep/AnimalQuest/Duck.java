package AnimalQuest;

public class Duck extends Animal implements Swimmable,Flyable {

    @Override
    public void fly() {
        System.out.println("Duck can fly.\n");        
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim.\n");        
    }
    
}
