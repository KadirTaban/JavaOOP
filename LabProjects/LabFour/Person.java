package LabProjects.LabFour;

public class Person {
    String firstName;
    String lastName;
    int age;
    String job;


    Person(String firstName, String lastName, int age, String job){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
    }
    
    public void displayInfo(){
        System.out.println(" name: "+this.firstName+" surname: "+this.lastName+" your age: "+this.age+" your job: "+this.job);
    }
    
}
