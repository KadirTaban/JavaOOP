package MultiClass ;


import MultiClass.Employee;


public class Company {
    private Employee[] employees;
   
    Company(Employee[] employees){
        this.employees = employees;
    }
    public void printAllEmployeesName(){
        for(Employee e: employees){
            System.out.println(e.getName());
        }

    }
}
