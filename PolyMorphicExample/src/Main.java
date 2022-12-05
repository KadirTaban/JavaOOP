public class Main {
    public static void main(String[] args) {

        Employee emp1 = new ComissionEmployee("Kadir Taban", 20220801,344.34,34.4);

        System.out.println(emp1.toString()+" earnings "+emp1.earning());

        Employee emp2 = new HourlyEmployee("Sevda Olgun",20220801,300,5);
        System.out.println(emp2.toString()+" earnings "+emp2.earning());

        Employee emp3 = new BasePlusComissionEmployee("Sare Taban",20210304,3,4,5500);
        System.out.println(emp3.toString()+" earnings "+emp3.earning());

    }
}