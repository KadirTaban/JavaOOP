public class SalariedEmployee extends Employee {
    double weeklySalary;

    public SalariedEmployee(String firstName_lastName, int ssn, double weeklySalary) {
        super(firstName_lastName, ssn);
        this.weeklySalary = weeklySalary;
    }


    @Override
    double earning() {
        return weeklySalary;
    }
}
