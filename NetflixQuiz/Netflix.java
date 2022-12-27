package NetflixQuiz;

import java.util.ArrayList;
import java.util.List;

public class Netflix {
    List <Material> materials = new ArrayList<>();
    User credential;
    boolean isLogin = false;

    Netflix(List <Material> materials, User credential){
        this.materials = materials;
        this.credential = credential;
    }

    boolean login(User user){
        if(user.password==credential.password && user.userName.equals(credential.userName)){
            isLogin = true;
            return isLogin;
        }
        else
            return isLogin;
    }

    public void addMovie(Movie movie){
        if(login(this.credential) == true){
            addMovie(movie);
        }
    }

    public void addBook(Book book){
        if(login(this.credential) == true){
            addBook(book);
        }
    }

    public void addMaterial(Material material){
        if(login(this.credential) == true){
            addMaterial(material);
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
