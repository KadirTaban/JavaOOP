package LabProjects.LabSix;

public class Main {
    public static void main(String[] args) {

        System.out.printf("%-17s %-20s %-25s %-15s \n","ID", "NAME","SURNAME", "AGE");
        Person person = new Person("Kadir","Taban",34);
        System.out.printf("%d, %20s, %20s, %20d \n",person.id,person.firstName,person.lastName,person.age);
        Person person2 = new Person("Omer","Taban");
        System.out.printf("%d, %20s, %20s, %20d \n",person2.id,person2.firstName,person2.lastName,person2.age);
        Person person3 = new Person();
        System.out.printf("%d, %20s, %20s, %20d \n",person3.id,person3.firstName,person3.lastName,person3.age);
        Person person4 = new Person(5);
        System.out.printf("%d, %20s, %20s, %20d \n",person4.id,person4.firstName,person4.lastName,person4.age);



    }

}

