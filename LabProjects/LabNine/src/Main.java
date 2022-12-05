package LabProjects.LabNine.src;
public class Main {
    public static void main(String[] args) {
        Shape2D thing = new Shape3D(2,23,4);
        //System.out.println(thing.computeArea());

        Shape2D thing_2= new Cube(4,4,4);
        //System.out.println(((Cube) thing_2).computeVolume());
        //System.out.println(((Cube) thing_2).computeArea());

        Shape2D thing_3=new Cylinder(3,4,5,6);
        //System.out.println(thing_3.toString());
        //System.out.println(((Cylinder) thing_3).computeArea());
        //System.out.println(((Cylinder) thing_3).computeVolume());

        Shape3D thing_4= new Cylinder(2,3,4,6);//the same thing_3
        //System.out.println(thing_4.computeArea());
        //System.out.println(thing_4.computeVolume());

        Shape2D thing_5 = new Square(4,4);
        System.out.println(thing_5.computeArea());


    }
}