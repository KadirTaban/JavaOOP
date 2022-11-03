package LabProjects.LabFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Kadir", "Taban",4,"Engineer");        
        Person person2 = new Person("Omer","Taban",5,"CEO");

        Car car = new Car(person, "Blue", "2000");

        car.getOwner().displayInfo();        
        car.changeOwner(person2);
        car.getOwner().displayInfo();        

    }
    
}
