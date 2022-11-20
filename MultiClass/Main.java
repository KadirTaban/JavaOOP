package MultiClass ;

import MultiClass.Employee;
import MultiClass.Company;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "kadirnull", 34.34);
        Employee employee2 = new Employee(1, "sevdanull", 34.434);

        Employee[]employees = new Employee[]{employee1,employee2};
        Company company = new Company(employees);
        company.printAllEmployeesName();
    }
}
