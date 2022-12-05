package LabProjects.LabNine.src;
public class Cylinder extends Shape3D{
    float radius;

    public Cylinder(float height, float width, float depth,float radius) {
        super(height, width, depth);
        this.radius=radius;
    }

    @Override
    public double computeArea() {
        return (PI*radius*radius)*2+((2*PI*radius)*2);
    }

    @Override
    public float computeVolume(){
        return (float) (PI*radius*radius*depth);
    }
}
