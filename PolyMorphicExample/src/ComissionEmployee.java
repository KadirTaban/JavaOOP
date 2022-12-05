public class ComissionEmployee extends Employee {
    double gross_sales;
    double comission_rate;

    public ComissionEmployee(String firstName_lastName, int ssn, double gross_sales, double comission_rate) {
        super(firstName_lastName, ssn);
        this.gross_sales = gross_sales;
        this.comission_rate = comission_rate;
    }

    @Override
    double earning() {
        return comission_rate*gross_sales;
    }
}
