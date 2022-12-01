package Inheritance;

public class Book extends Document {
    String title;

    Book(String[] authors, DateInfo date, String title){
        super(authors,date);
        this.title = title;
        
    }

    public String getTitle(){
        return title;
    }

}