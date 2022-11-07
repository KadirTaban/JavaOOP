package StaticMethod;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
    
    public double getSalary(){
        return salary;
    }
    
}
