package LabProjects.LabThree.LabThreeV2;

public class Main {
public static void main(String[] args) {
    
    Worker workerOne = new Worker("kadir",345);
    System.out.println("worker issue: " + Worker.counter);
    Worker workerTwo = new Worker("sevda",2344);
    System.out.println("worker issue: "+Worker.counter);
    Worker workerThree = new Worker("Omer",23443 );
    System.out.println("worker issue: "+Worker.counter);

    try{
      
        workerOne.setSalary(-100);

        
    }catch(IllegalArgumentException e){

        System.out.println(e.getMessage());
    }
   
}    
}
