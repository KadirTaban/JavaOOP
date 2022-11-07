package LabProjects.LabFour.Extra;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.4);
        Circle circle2 = new Circle(4.4);
        Circle circle3 = new Circle(5.4);

        Circle[] circles = {circle1,circle2,circle3};
        
        for (Circle c: circles){
            System.out.println(c.computeArea());
        }
    }
}
