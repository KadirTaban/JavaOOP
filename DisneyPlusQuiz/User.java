package DisneyPlusQuiz;


public class User extends Consumer  {
    String userName, password;
    public String getPassword() {
        return password;
    }
    public String getUserName() {
        return userName;
    }
    boolean loginStatus;
    User(int id, int birthYear, int salary, String firstName, String lastName,String username, String password) {
        super(id, birthYear, salary, firstName, lastName);
        this.userName = username;
        this.password = password;
    }
    
    

    }

   

    

    
    

