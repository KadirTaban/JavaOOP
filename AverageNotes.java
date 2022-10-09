import java.util.Scanner;

public class AverageNotes{
    public static void main(String[] args) { 
        int quise, midterm, ffinal;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.println("input quise note");
        quise = input.nextInt();
        System.out.println("input midterm note");
        midterm = input.nextInt();
        System.out.println("input final note");
        ffinal = input.nextInt();


        System.out.println(quise);
        System.out.println(midterm);
        System.out.println(ffinal);
        average = (quise*0.2)+(midterm*0.35)+(ffinal*0.45);
        System.out.println("Note of Average: " + average );

        String sonuc = (average >= 50 )? "You Passed": "Try Again";
        System.out.println(sonuc);
    }
}