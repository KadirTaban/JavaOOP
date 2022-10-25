package ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;  

public class ArithmeticExcept {
 
    public static void main(String[] args) throws InputMismatchException {
        System.out.println("program is running");
    try{

        Scanner input = new Scanner(System.in);
        input.nextInt();
    }catch(InputMismatchException e){
        System.out.println("there is mismatch exception.");
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    finally{
        System.out.println("done");
    }
}
    

}
