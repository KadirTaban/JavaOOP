package NetflixQuiz;

import java.util.ArrayList;
import java.util.List;

public class Netflix {
    List <Material> materials = new ArrayList<>();
    User credential;
    boolean isLogin = false;

    Netflix(Movie movie, User credential){
        this.materials.add(movie);
        this.credential = credential;
    }

   
    boolean login(User user){
        if(user.password.equals(credential.password) && user.userName.equals(credential.userName)){
            isLogin = true;
            return isLogin;
        }
        else
            return isLogin;
    }

    public void addMovie(Movie movie){
        if(isLogin){
            this.materials.add(movie);
        }
    }

    public void addBook(Book book){
        if(isLogin){
            this.materials.add(book);
        }
    }

    public void addMaterial(Material material){
        if(isLogin){
            this.materials.add(material);
        }
    }

    double biggestOne(Material material,Book book, Movie movie){
        double materialScore = material.getAvgScore();
        double bookScore = book.getAvgScore();
        double movieScore = movie.getAvgScore();
        if(bookScore>movieScore){
            if(movieScore>materialScore)
                return bookScore;
        }
        else if(movieScore>bookScore){
            if(bookScore>materialScore)
                return movieScore;
        }
        else
            return materialScore;
        return 1;
    }



    double smallestOne(Material material,Book book, Movie movie){
        double materialScore = material.getAvgScore();
        double bookScore = book.getAvgScore();
        double movieScore = movie.getAvgScore();
        if(bookScore<movieScore){
            if(movieScore<materialScore)
                return bookScore;
        }
        else if(movieScore<bookScore){
            if(bookScore<materialScore)
                return movieScore;
        }
        else
            return materialScore;
        return 1;
    }



}
