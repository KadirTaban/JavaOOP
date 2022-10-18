package StudentStatic;

public class Main {
    public static void main(String[] args) {
        System.out.println("Online ogrenci: " + Student.howStudent());
        Student s1 = new Student("Ali",2000,100);
        Student s2 = new Student("Kadir", 2001,200);
        Student s3 = new Student("Omer", 2002,100);
        System.out.println("Online ogrenci: " + Student.howStudent());
        s1.exit();
        System.out.println("Online ogrenci: " + Student.howStudent());

        int[] notlar = new int[3];
        notlar[0] = s1.point;
        notlar[1] = s2.point;
        notlar[2] = s3.point;

        double overall = Student.calcOverall(notlar);
        System.out.println(overall);
        
    }
 
    
    
}
