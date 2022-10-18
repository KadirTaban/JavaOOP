package StudentStatic;

public class Student {
    String name;
    public int id;
    private static int counter = 0 ;
    public int point; 

    Student(String name, int id, int point){
        this.name = name;
        this.id = id;
        Student.counter++;
        this.point = point;
        
    }

    public void exit() {
        Student.counter--;
    }
    
    public static int howStudent(){
        return Student.counter;

    }

    public static double calcOverall(int[] arr){
        double overall = 0 ;
        for(int i=0; i<arr.length;i++){
            overall =+ arr[i];
        }
        return overall / arr.length;
    } 
    
}
