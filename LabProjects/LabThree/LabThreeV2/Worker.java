package LabProjects.LabThree.LabThreeV2;

public class Worker {
    public String name;
    public int salary;
    public static int counter=0;
    

    Worker(String name, int salary){
        this.name = name;
        this.salary = salary;
        Worker.counter++;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary)throws IllegalArgumentException{
        if(salary<=0){
            String errorMessage = "salary amount must be greater zero";
            throw new IllegalArgumentException(errorMessage);
        }

        this.salary = salary;
    }
}
