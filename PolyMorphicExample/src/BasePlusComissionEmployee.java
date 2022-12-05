public class BasePlusComissionEmployee extends ComissionEmployee {
    int baseSalary;

    public BasePlusComissionEmployee(String firstName_lastName, int ssn, double gross_sales, double comission_rate,int baseSalary) {
        super(firstName_lastName, ssn, gross_sales, comission_rate);
        this.baseSalary = baseSalary;

    }

    @Override
    double earning(){
        return super.earning() + this.baseSalary;
    }
}
