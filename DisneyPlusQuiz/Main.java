package DisneyPlusQuiz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        
        Consumer actor = new Consumer(1, 2000, 9660, "kadir", "Taban");
        Consumer actor2 = new Consumer(2,   2001, 9660,   "kadir", "Taban");
        Consumer actor3 = new Consumer(3,   2002, 9660,   "kadir", "Taban");
        Consumer actor4 = new Consumer(4,   2004, 9660,   "kadir", "Taban");


        Consumer director1 = new Consumer(11,   1981,2100, "director1", "director1");
        Consumer director2 = new Consumer(12,   1982,2200, "director2", "director2");
       

        Category c1 = new Category(1,   "CATCODE1",   "catName1");
        Category c2 = new Category(2,   "CATCODE2",   "catName2");
        
        
        

        ArrayList<Integer> scores1 = new    ArrayList<>();
        ArrayList<Integer> scores2 = new    ArrayList<>();
 


        ArrayList<Consumer> actors1 = new   ArrayList<>();
        ArrayList<Consumer> actors2 = new   ArrayList<>();
       

        
        Movie m1 = new Movie(1, "movname1",scores1,  1991, 10100,c1,  "movie", actors1, director1);
        m1.addActor(actor);
        m1.addActor(actor2);

        Movie mov2 = new Movie(2,"movname2",scores2, 1992, 10200,c2, "movie", actors2, director2);
        mov2.addScore(35);
        mov2.addScore(45);
        mov2.addScore(55);
        mov2.addActor(actor2);
        mov2.addActor(actor3);

        List<Movie> movies = new ArrayList<>();
        movies.add(mov2);
        movies.add(m1);

        ArrayList<Asset> assets = new ArrayList<>();
        User user2 = new User(1,2001,3000,"Kadir","Taban","Kadir","Taban");

        DisneyPlus disneyPlus = new DisneyPlus(assets);

        disneyPlus.login(user2);
        disneyPlus.addMovie(mov2);
        disneyPlus.displayHighestMovie(movies);
        disneyPlus.findActorById(movies,1);
        disneyPlus.displayLowestAverage(movies);

        
        
        System.out.println("Movie1's max score: " + m1.getMaxScore() + " min score: " + m1.getMinScore());
        System.out.println("Movie2's max score: " + mov2.getMaxScore() + " min score: " + mov2.getMinScore());

// HAPPY NEW YEAR DR.KASIM 🧡
    
}

        
}
    