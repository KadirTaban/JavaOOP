package LabProjects.LabSix;

public class Person {
    String where;
    static int ID = 0;
    int id;
    int age;
    String firstName,lastName;

    Person(String firstName, String lastName, int age){
        this.ID ++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ID;
        this.age = age;
    }


    Person(String firstName, String lastName){
        this.ID++;
        this.firstName=firstName;
        this.lastName=lastName;
        this.id = ID;
        this.age=0;
    }
    Person(int id){
        this.id = id;
     
    }
    
    Person(){
        this.ID++;
        this.id = ID;
    }


   


}
