package Book;

public class Book implements Comparable<Book> {
    private String name;
    private double price;

    Book(String name, double price){
        this.name = name;
        this.price=price;
    }

    double totalPrice(){
        return price + (8 * price)%100;
    }
    @Override public int compareTo(Book b){
        if(price < b.price){
            return 1;
        }
        else if( price == b.price){
            return 0;
        }else{
            return -1;
        }
    }
    
}
