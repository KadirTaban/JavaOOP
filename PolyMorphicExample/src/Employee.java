public abstract class Employee {

    String firstName_lastName;
    int ssn;

    public Employee(String firstName_lastName, int ssn){
        setFirstname_lastName(firstName_lastName);
        setSsn(ssn);
    }

    private void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public void setFirstname_lastName(String firstName_lastName) {
        this.firstName_lastName=firstName_lastName;
    }

    abstract double earning();

    @Override

    public String toString(){
        return "name: " + this.firstName_lastName +" ssn: " +this.ssn;
    }

}
