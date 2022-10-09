import java.util.Scanner;

public class Login {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String u_name, pass;
        System.out.println("Enter an username:");
        u_name = scan.nextLine();
        System.out.println("Enter a password: ");
        pass = scan.nextLine();
        if (u_name.equals("kadirdev@mountain.labs") && pass.equals("123")){
            System.out.println("Success!");
        }else{
            System.out.println("Incorrect password or username!");
        }
    }
}
