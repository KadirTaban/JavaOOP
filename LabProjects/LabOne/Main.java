package LabProjects.LabOne;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Worker worker1 = new Worker();
        worker1.name = "Sevda";
        worker1.socialSecurityNumber = 2020202002;
        worker1.wage = 20;
        worker1.workingHours = 60;

        Scanner scan = new Scanner(System.in);
        System.out.println("enter username: ");
        String name = scan.nextLine();
        System.out.println("enter socialSecurityNumber: ");
        int socialSecurityNumber = scan.nextInt();
        System.out.println("enter workingHours: ");
        int workingHours = scan.nextInt() ;
        System.out.println("enter wage: ");
        float wage= scan.nextFloat();


        Worker worker2 = new Worker();
        worker2.name = name;
        worker2.socialSecurityNumber=socialSecurityNumber;
        worker2.wage = wage;
        worker2.workingHours = workingHours;


        worker1.displayInfo();
        worker1.displaySalary();

        worker2.displayInfo();
        worker2.displaySalary();



    }
}
