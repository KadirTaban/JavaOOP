package LabProjects.LabFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputName, inputLastname, inputJob;
        int inputAge;

        Scanner input = new Scanner(System.in);

        System.out.print(" name: ");
        inputName = input.nextLine();

        System.out.print(" surname: ");
        inputLastname = input.nextLine();

        System.out.print(" job: ");
        inputJob = input.nextLine();

        System.out.print(" age: ");
        inputAge = input.nextInt();

        Person person = new Person(inputName, inputLastname,inputAge,inputJob);

        person.displayInfo();
        
        Car car = new Car(person, "Blue", "2000");

        car.getOwner().displayInfo();        
    }
    
}
