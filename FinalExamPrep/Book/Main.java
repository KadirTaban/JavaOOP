package Book;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Thevenin's Theorem", 6000);
        Book b2 = new Book("Thevenin's Theorem",6000);
        Book b3 = new Book("Nutuk", 0);
        Book b4 = new Book("Bir bilim adamının romanı",133);
        
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        
        LinkedList<Book> books = new LinkedList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        Collections.sort(books);
        System.out.println("Sorted list ");

        ListIterator iterator = books.listIterator();

        while(iterator.hasNext()){
            Book b = (Book) iterator.next();
            System.out.println(b.name); 
        }
        
        while(iterator.hasPrevious()){
            Book b = (Book) iterator.previous();

            System.out.println(b.name);
        }
        
        for(Book b: books){
            System.out.println(b.totalPrice());
        }
    
    }

}
