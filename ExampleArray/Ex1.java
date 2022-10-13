package ExampleArray;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] liste = new int[4];
        

        liste[0] = 1;
        liste[1] = 2;
        liste[2] = 3;
        liste[3] = 4;


        for (int i = 0; i<liste.length;i++){
            System.out.println(liste[i]);
        }

        int[] liste2 = new int[4];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i<liste2.length; i++){
            liste2[i] = scan.nextInt();
        }

        for (int i = 0; i<liste2.length; i++){
            System.out.println(liste2[i]);
        }




    }
    
}
