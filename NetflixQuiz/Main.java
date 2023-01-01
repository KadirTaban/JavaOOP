package NetflixQuiz;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kadir","1234");
        

        Person person = new Person(0, "kadir", "taban", 20);
        Person person2 = new Person(1,"ömer","taban",21);
        Person person3 = new Person(2,"sevda" , "taban", 22);

        Category category = new Category(0, "HORROR", "Fantastic");
        Category category2 = new Category(1, "Comedy", "Fantastic");

        ArrayList <Integer> score1 = new ArrayList<>();
        score1.add(1);
        score1.add(2);
        score1.add(4);
        ArrayList <Person> act1 = new ArrayList<>();
        act1.add(person2);
        act1.add(person);
        Movie movie = new Movie(1, "Kadir",2000,score1 ,category,"2000",act1,person);
        System.out.println(movie.getAvgScore());
        Netflix netfiliz = new Netflix(movie,user);
        System.out.println(netfiliz);
        movie.showDetail();






    }
}