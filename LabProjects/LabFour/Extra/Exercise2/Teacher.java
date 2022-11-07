package LabProjects.LabFour.Extra.Exercise2;

import java.lang.annotation.Retention;

public class Teacher {
    private int id;
    private Branch branch;

    Teacher(int id, Branch branch){
        this.id = id;
        this. branch = branch;
    }

    public Branch getBranch(){
        return branch;
    }
    public int getID(){
        return id;
    }


    

}
