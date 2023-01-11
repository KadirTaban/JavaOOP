package Book;


public class Book implements Comparable<Book> {
    String name;
    private double price;

    Book(String name, double price){
        this.name = name;
        this.price=price;
    }

    double totalPrice(){
        return price + (8 * price)%100;
    }
    @Override public boolean equals(Object o){
        if(this == o )
            return true;

        if(o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return  name == book.name && price == book.price && name.equals(book.name);
            
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
