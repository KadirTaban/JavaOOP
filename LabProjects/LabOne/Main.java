package LabProjects.LabOne;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter username: ");
        String name = scan.nextLine();
        System.out.println("enter socialSecurityNumber: ");
        int socialSecurityNumber = scan.nextInt();
        System.out.println("enter workingHours: ");
        int workingHours = scan.nextInt() ;
        System.out.println("enter float: ");
        float wage= scan.nextFloat();


        Worker worker = new Worker(name,socialSecurityNumber,wage,workingHours);

        worker.displayInfo();

        worker.displaySalary();



    }
}
