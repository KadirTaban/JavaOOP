package NetflixQuiz;

public class Category {
    int id;
    String categoryCode;
    String categoryName;

    Category(int id, String code, String name){
        this.id = id;
        this.categoryCode = code;
        this.categoryName = name;
    }
}
