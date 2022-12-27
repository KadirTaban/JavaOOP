package NetflixQuiz;
import java.util.List;

public class Book extends Material {
    Person writer;
    int numberOfPages;

    Book(int id, String name, List<Integer> scores, int release_year, Category category, String type,Person writer,int numberOfPages, Person person) {
        super(id, name, scores, release_year, category, type);
        this.writer = writer;
        this.numberOfPages = numberOfPages;
    }

    public void setWriter(Person writer) {
        this.writer = writer;
    }

    @Override
    double getAvgScore(){
        int sum = 0;
        double result;
        for(int s: scores){
            sum = sum + s;
        }
        int factor = this.scores.size();
        result = sum/factor;
        return result;
    }

    @Override
    void addScore(int score){
        this.scores.add(score);
    }

    @Override
    void showDetail(){
        System.out.printf(this.name,this.scores,this.scores,this.release_year,this.category,this.price,this.type,this.numberOfPages,this.writer);
    }





}

