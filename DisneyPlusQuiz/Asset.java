package DisneyPlusQuiz;

import java.util.ArrayList;
import java.util.List;

public class Asset {
    int id;
    String name;
    List<Integer> scores = new ArrayList<>();
    int release_year;
    Category category;
    int price;
    String type;

    Asset(int id, String name,List<Integer> scores, int release_year,int price,Category category, String type){
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.release_year = release_year;
        this.category = category;
        this.price = price;
        this.type = type;
    }

    void addScore(int score){
        this.scores.add(score);
    }

    public int getMaxScore(){
        return this.scores.stream()
                .mapToInt(v -> v)
                .max().orElse(-1);
    }

    public int getMinScore(){
        return this.scores.stream()
                .mapToInt(v -> v)
                .min().orElse(-1);
    }
    double getAvgScore(){
        int sum = 0;
        double result;
        for(int s: this.scores){
            sum = sum + s;
        }
        int factor = this.scores.size()+1;
        result = sum/factor;
        return result;
    }

    void showDetail(){
        System.out.printf(this.name+this.price+this.name+this.category.categoryName+this.category+ this.release_year);
    }

        


}
