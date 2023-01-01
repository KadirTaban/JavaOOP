package DisneyPlusQuiz;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Asset {
    ArrayList<Consumer> actors;
    Consumer director;

    Movie(int id, String name, List<Integer> scores, int release_year, int price, Category category, String type, ArrayList<Consumer> actors, Consumer director) {
        super(id, name, scores, release_year, price, category, type);
        this.actors = actors;
        this.director = director;
    }

    boolean deleteActor(int consumerId){
        Consumer actor = this.actors.get(consumerId);
        
        if(this.actors.remove(actor)){
            return true;
        }
        else{
            return false;
        }
    }

    void addActor(Consumer actor){
        this.actors.add(actor);
    }

    @Override
    void showDetail(){
        System.out.printf(this.name+this.price+this.name+this.category.categoryName+this.category+ this.release_year);
    }
}
