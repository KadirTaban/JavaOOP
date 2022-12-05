package LabProjects.LabNine.src;
public class Rectangle extends Shape2D{

    public Rectangle(float height, float width) {
        super(height, width);
    }

    @Override
    public double computeArea(){
        return height*width;
    }

}
