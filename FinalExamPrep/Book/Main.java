package Book;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Thevenin's Theorem", 6000);
        Book b2 = new Book("Notre Damme'nin Kamburu",200);
        Book b3 = new Book("Nutuk", 0);
        Book b4 = new Book("Bir bilim adamının romanı",133);
    
        LinkedList<Book> books = new LinkedList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        Collections.sort(books);
        System.out.println("Sorted list ");
        for(Book b: books){
            System.out.println(b.totalPrice());
        }
    
    }

}
