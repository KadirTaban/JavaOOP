package StaticMethod;

public class Main {
    public static void main(String[] args) {
        CompanyName companyName = CompanyName.APPLE;
        Employee employee1 = new Employee(10, "kadir",233.3);
        Employee employee2 = new Employee(11, "ömer",23345);
        Employee employee3 = new Employee(12, "atila",34443);

        Employee[] emps = new Employee[]{employee1, employee2, employee3};
        Company company = new Company(companyName, emps);


        company.printAllEmployeesName();
        company.printAllEmployeesID();
        company.printAllEmployeesSalary();
    }
    
}
