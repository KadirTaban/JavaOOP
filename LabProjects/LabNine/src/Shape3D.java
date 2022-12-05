package LabProjects.LabNine.src;
public class Shape3D extends Shape2D {
    float depth;

    public Shape3D(float height, float width, float depth) {
        super( height, width);
        this.depth = depth;
    }

    public float computeVolume(){
        return (float) (depth*PI*height*width);
    }


}

