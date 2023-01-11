package CompareStudents;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student(101,"kadir",132));
        students.add(new Student(106,"selam",45));
        students.add(new Student(123,"cevher",54));

        Collections.sort(students);

        for(Student s: students){
            System.out.println(s);
        }
    }    
}
