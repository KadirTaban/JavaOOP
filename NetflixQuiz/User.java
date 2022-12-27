package NetflixQuiz;

public class User extends Person {
    String userName;
    String password;

    User(int id, String firstName, String lastName, int age, String userName, String password) {
        super(id, firstName, lastName, age);
        this.userName = userName;
        this.password = password;
    }

}