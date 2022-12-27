package NetflixQuiz;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Material {
    List<Person> actors = new ArrayList<>();
    Person director;

    Movie(int id, String name,int release_year, List<Integer> scores, Category category, String type, List<Person> actors, Person director) {
        super(id, name, scores, release_year, category, type);
        this.actors = actors;
        this.director = director;
    }

    void addActor(Person actor){
        this.actors.add(actor);
    }

    @Override
    void showDetail(){
        System.out.printf(this.name+" "+this.release_year+" "+this.category.categoryName+" "+this.release_year+" "+this.type);

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


}
