package Classes;

public class Employee {
    private String name;
    double salary;
    private int workHours, hireYear;

    Employee(int hireYear, int workHours, double salary, String name){
        this.name = name;
        this.hireYear = hireYear;
        this.workHours = workHours;
        this.salary = salary;

    }

    public double tax(){
        if(this.salary > 1000){
            return 1000*0.3;
        }else{
            return 0;
        }
    }

    public double bonus(){
        int extraHours = 40-this.workHours;
        double sonuc;
        sonuc = extraHours*10;
        return sonuc;
    }

    public double increase(){
        int year= 2022 - this.hireYear;
        double newSalary;
        if(year<10){
            newSalary = this.salary * 1.1;
            return newSalary;
        }else if(year >= 10 && year <20){
            newSalary = this.salary * 1.25;
            return newSalary;
        }else{
            newSalary = this.salary * 1.5;
            return newSalary;
        }

    }

    public void toString(Employee emp1) {
        System.out.println("Tax: " + emp1.tax());
        System.out.println("Bonus: " + emp1.bonus());
        System.out.println("Increase Salary: " + emp1.increase());
        double totalSalary =  emp1.salary - emp1.tax() + emp1.bonus();
        System.out.println("Total salary with tax and bonus");
    
    }
}
