package MidtermExams.Worker;

public class Company {
    static int index;
    Worker[] workers;
    public Company(int num){
    workers = new Worker[num];
    }
    void addWorker(Worker w){
    workers[index] = w;
    index++;
    }
    public void showData(Worker w){
    System.out.println(w.id +":"+w.compName);
    }
}