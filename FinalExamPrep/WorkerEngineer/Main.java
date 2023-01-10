package WorkerEngineer;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Engineer("newBie");
        Worker w2 = new ChiefEngineer("senior", 3);
        System.out.println(w1);
        System.out.println(w2);
    }
}
