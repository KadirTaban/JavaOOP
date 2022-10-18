package Encapsulation;

public class Book {
    public String name, publisher,author;
    private int numberOfPage;
    


    Book(String name, int numberOfPage, String author, String publisher){
        this.name = name;
        this.author = author;
        this.publisher = publisher;

        if(numberOfPage<1){
            this.numberOfPage = 10;
        }else {
            this.numberOfPage = numberOfPage;
        }

    }

    public void pageSize(){
        System.out.println(numberOfPage);
    }
    public void setPageSize(int newPage){
        this.numberOfPage = newPage;

    }
}   