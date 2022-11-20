package MidtermExams.Worker;

public class Main {
    public static void main(String[] args) {
    Worker w1 = new Worker("Ahmet");
    System.out.println(Worker.compName); //(1)
    Worker w2 = new Worker("Mert");
    Worker w3 = new Worker("Cenk");
    System.out.println(Worker.number); //(2)
    Worker w4 = new Worker("Okan");
    System.out.println(w2.id); //(3)
    Company comp = new Company(4);
    comp.addWorker(w1);
    comp.addWorker(w2);
    comp.addWorker(w3);
    comp.addWorker(w4);
    System.out.println(Company.index); //(4)
    Worker.compName ="Just Steel Inc.";
    comp.showData(w3); //(5)
    }
    }