package LabProjects.LabOne;
    
public class Worker {
    String name;
    static int socialSecurityNumber;
    float wage;
    int workingHours;

    public void displayInfo(){
        System.out.println("name: "+name+ " socialSecurityNumber: "+socialSecurityNumber);
     }

    public void displaySalary(){
        float salary = workingHours* wage;

        System.out.println("salary: "+salary);
    }


}





