package CycleRentAbs;

public class Cycle {
    private int id;
    int somePeople;
    boolean available;
    public String color;

    Cycle(int id, int somePeople,boolean available,String color){
        this.id = id;
        this.available = available;
        this.color = color;
        this.somePeople = somePeople;
    }

    public void toString(Cycle cycle1) {
        if(cycle1.available == true){
            System.out.println("available for rent ! " );
            System.out.println("color: " + this.color);
            System.out.println("Two person can use bicycle");

        }
        else {
            System.out.println("bicycle has already rented. ");
        }



    }




}
