package Inheritance;

public class DateInfo {
    int day;
    int month;
    int year;

  
    DateInfo(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString(){
        return day + "/" + month + "/" + year;
    }
}
