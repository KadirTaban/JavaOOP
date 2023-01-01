package DisneyPlusQuiz;

import java.util.ArrayList;
import java.util.List;

public class Book extends Asset {
    private Consumer writer;
 

    private int numberOfPages;


    Book(int id, String name, List<Integer> scores, int release_year, int price, Category category, String type, Consumer writer, int numberOfPages) {
        super(id, name, scores, release_year, price, category, type);
        this.writer = writer;
        this.numberOfPages = numberOfPages;
    }
    

    public void setWriter(Consumer writer) {
        this.writer = writer;
    }
    public Consumer getWriter() {
        return writer;
    }
    
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    public int getNumberOfPages() {
        return numberOfPages;
    }
}
