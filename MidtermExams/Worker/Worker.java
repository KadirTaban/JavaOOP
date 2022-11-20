package MidtermExams.Worker;

public class Worker {
    String name;
    public static String compName,
    public static int number;
    public int id;
    public Worker(String n){
    this(n, number);
    compName ="Iron and Steel Inc.";
    }
    private Worker(String n, int num){
    number = num;
    number++;
    this.name =n;
    this.id =number;
    }
    }