package LabProjects.LabNine.src;
public class Square extends Shape2D {


    public Square(float height, float width) {
        super(height, width);
    }

    @Override
    public double computeArea() {
        return width*width;
    }
}
