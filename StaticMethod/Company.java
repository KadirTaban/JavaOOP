package StaticMethod;
enum CompanyName{
    APPLE,
    MICROSOFT,
    GOOGLE,
    IBM
}

public class Company {
    private Employee[] employees;
    private CompanyName companyName;
        
    public Company(CompanyName companyName, Employee[] employees){
        this.companyName = companyName;
        this.employees = employees;
    }

    public CompanyName getCompanyName(){
        return companyName;
    }
    
    public Employee[] getEmployees(){
        return employees;
    }

    public void printAllEmployeesName(){
        for(Employee e: employees)
            System.out.println(e.getName());
    }

    public void printAllEmployeesID(){
        for(Employee e: employees)
            System.out.println(e.getId());
    }
    public void printAllEmployeesSalary(){
        for(Employee e: employees)
            System.out.println(e.getSalary());
    }

}
