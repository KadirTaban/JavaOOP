package MultiClass ;

public class Employee {
    private static String companyName;
    private double salary;
    private String name;
    private int id;


    public String getCompanyName(){
        return  String.format("%s",companyName).toString();
    }

    public String getName(){
        return String.format("%s",name).toString();
    }

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
