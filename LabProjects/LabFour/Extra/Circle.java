package LabProjects.LabFour.Extra;

public class Circle {
    private static double pi=3.141519; 
    private double radius;


    Circle(double radius){
        this.radius =radius;
    }

    void setRadius(double newRadius){
        this.radius = newRadius;
    }

    double computeArea(){
        return radius*radius*pi;
    }
    

    
}
