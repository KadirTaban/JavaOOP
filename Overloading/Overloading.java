package Overloading;

public class Overloading {

    static int add(int a, int b){
        System.out.println("Methods One: ");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("Methods Two: ");
        return a+b+c;
    }
    static double add(int a, int b, double c){
        System.out.println("Methods Three: ");
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println(add(1, 8));
        System.out.println(add(3,4,5));
        System.out.println(add(1, 4,5.0));




    }



}
