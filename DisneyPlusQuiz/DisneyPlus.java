package DisneyPlusQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class DisneyPlus {
    ArrayList<Asset> assets;
    User credential = new User(0,0 , 0, null, null, "Kadir", "Taban");
    boolean isLogin = false ;
    public Object movies;

    DisneyPlus(ArrayList<Asset> assets){
        this.assets = assets;
    }

    public void login(User user){
        if (credential.getUserName().equals(user.getUserName()) && credential.getPassword().equals(user.getPassword()))
            this.isLogin = true;
        else
            System.out.println("Username or password is incorrect");
    } 

    public void addMovie(Movie movie){
        if (isLogin)
            this.assets.add(movie);
        else
            System.out.println("You must login first");
    }

    public boolean removeMovie(int movieId){
        if (!isLogin)
            System.out.println("You must login first");
        
        Movie movie = (Movie) this.assets.get(movieId);
        this.assets.remove(movie);
        return true;
        


    }

    public void addBook(Book b1){
        if (credential.loginStatus && isLogin)
            this.assets.add(b1);
        else
            System.out.println("You must login first");
    }

    public boolean removeBook(int bookId){
        if (!isLogin)
            System.out.println("You must login first");
        
        Book book = (Book) this.assets.get(bookId);
        this.assets.remove(book);
        return true;
        
    }

    void addAsset(Asset a1 ){
        if (credential.loginStatus && isLogin)
            this.assets.add(a1);
        else
            System.out.println("You must login first");
    }
   // N1- Create the function that displays the information of the OLDEST actors.
    void findOldestActor(ArrayList <Movie> movies){
        List<Integer> actors = new ArrayList<>();
        for(Movie m : movies){
            for(Consumer c: m.actors){
                actors.add(c.birthYear);
            }
        }
        System.out.printf("The oldest actor is: "+Collections.min(actors)); 
    }
    //Create the function that displays the information of the movie with the lowest average score on the screen.
    void displayLowestAverage(List <Movie> movies){
        List<Double> averages = new ArrayList<>();
        for(Asset a :movies){
            averages.add(a.getAvgScore());
        }
        
        System.out.printf(Collections.min(averages)+"has the lowest average  ");
    }
//N3-Create a function that takes a "movie_id" as a parameter and displays information of highest paid actor in that movie.

    void displayHighestMovie(List<Movie> movies){
        List<Integer> salaries = new ArrayList<>();
        for(Movie m : movies){
            for(Consumer c: m.actors){
                salaries.add(c.salary);
            }
        }
        System.out.println(Collections.min(salaries));
    }

   //N5-Create a function that takes a Consumer's id as a parameter and displays the information of all movies acted by him/her on the screen.

 

void findActorById(List <Movie> movies,int consumer_id){
    List <Consumer> actors = new ArrayList<>();

    for(Movie a :movies){
        actors = a.actors;
    }
    String name =actors.get(consumer_id).firstName;
    String lastName = actors.get(consumer_id).lastName;
    System.out.println(name+lastName);
}




}
     
    
    

