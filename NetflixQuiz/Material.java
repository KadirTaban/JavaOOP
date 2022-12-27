package NetflixQuiz;
import java.util.ArrayList;
import java.util.List;

public abstract class Material {
    int id;
    String name;
    List<Integer> scores = new ArrayList<>();
    int release_year;
    Category category;
    int price;
    String type;


    Material(int id, String name,List<Integer> scores,int release_year,Category category,String type){
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.release_year = release_year;
        this.category = category;
        this.type = type;
    }

    void addScore(int score){
        this.scores.add(score);
    }

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


    void showDetail(){
        System.out.printf(this.name,this.scores,this.scores,this.release_year,this.category,this.price,this.type);

    }


}
