package LabProjects.LabNine.src;
public abstract class Shape2D {
    static double PI = 3.14;
    float height;
    float width;

    public Shape2D(float height, float width){
        this.height = height;
        this.width = width;
    }


    public double computeArea(){
        return height*PI*width;
    }
    @Override
    public String toString(){
        return"height: " + this.height +" width: " +this.width;
    }
}
