public class HourlyEmployee extends Employee {
    double wage;
    int hourly_work;
    public HourlyEmployee(String firstName_lastName, int ssn, double wage,int hourly_work ) {
        super(firstName_lastName, ssn);
        this.wage = wage;
        this.hourly_work = hourly_work;
    }

    @Override
    double earning() {
        if(hourly_work<=40){
            return wage*hourly_work;
        }
        else {
            return 40 * wage + (hourly_work - 40) * wage * 1.5;
        }
    }
}
