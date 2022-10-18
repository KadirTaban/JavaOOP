package Encapsulation;

public class Main {
    public static void main(String[] args) {
        
        Book b1 = new Book("Harry potter", 123, "kadir", "palme");
        b1.pageSize();
        b1.setPageSize(150);
        b1.pageSize();
    }
}
