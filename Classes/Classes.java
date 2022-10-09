package Classes;

public class Classes {
    public static void main (String[] args){

        Calculator machine1;
        machine1 = new Calculator(10,5);
        System.out.println(machine1.toplama());
        machine1.sayi1 = 23;
        System.out.println(machine1.cikarma());
        System.out.println(machine1.carpma());
        System.out.println(machine1.bolme());


    }
    
}
