package LabProjects.LabNine.src;
public class Cube extends Shape3D{


    public Cube(float height, float width, float depth) {
        super(height, width, depth);
    }

    @Override
    public double computeArea() {
        return width*width*6;
    }

    @Override
    public float computeVolume() {
        return width*width*width;
    }
}
