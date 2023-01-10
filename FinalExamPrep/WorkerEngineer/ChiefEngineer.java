package WorkerEngineer;

public class ChiefEngineer extends Worker{

    public ChiefEngineer(String name,int hour) {
        super(name, hour);
        this.wage = 20;
        //TODO Auto-generated constructor stub
    }

    @Override
    int Salary() {
        // TODO Auto-generated method stub
        return this.hour * wage * 2 + super.baseSalary() ;
    }

    
}
