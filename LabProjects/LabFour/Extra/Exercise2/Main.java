package LabProjects.LabFour.Extra.Exercise2;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, Branch.ENG);
        Teacher teacher2 = new Teacher(2, Branch.PHYSICS);
        Teacher teacher3 = new Teacher(3, Branch.CS);


        Teacher[] teachers = {teacher1,teacher2,teacher3};
        
        //for each loop
        for(Teacher t:teachers){
            System.out.print(t.getID()+":");
            System.out.println(t.getBranch());

            
        }
        
    }
}
