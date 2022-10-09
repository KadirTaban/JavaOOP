import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number: ");
        int sayi = scan.nextInt();
        switch(sayi) {
            case 1:
                System.out.println("Number is One");
                break;
            case 2:
                System.out.println("Number is Two");
                break;
            case 3:
                System.out.println("Number is Three");
                break;
            default:
                System.out.println("Please enter an invalid number.");

        }
    }
}
