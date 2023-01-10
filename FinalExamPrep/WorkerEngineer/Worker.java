package WorkerEngineer;

public abstract class Worker {
    private String name;
    protected int hour;
    protected int wage;
    
    public Worker(String name, int hour){
        this.name = name;
        this.hour = hour;
    }

    public Worker(String name){
        this.name = name;
    }
    
    abstract int Salary();
    @Override
    public String toString(){
        return name+" " + this.Salary();
    }
    int baseSalary(){
        return 1000;
    }
}
