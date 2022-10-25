package ExceptionHandling.TimeCheck;

public class Time1 {
    private int hour;
    private int minute;
    private int second;

    public Time1(int h, int m, int s){
            try{
                setHour(h);
                setMinute(m);
                setSecond(s);
            }catch(Exception e){
                System.out.println("the problem is : "+e.getMessage());

            }      
    }

    public void setHour(int h){
        if(h<0 || h>23){
            throw new IllegalArgumentException("this hour value must be in 0-23");
        }
        this.hour = h;
    }
    public void setMinute(int m){
        if(m<0 || m>60){
            throw new IllegalArgumentException("the minute value must be in 0-59");
        }
        this.minute = m;
    }
    public void setSecond(int s){
        if(s<0 || s>60){
            throw new IllegalArgumentException("the second value must be in zero-59");
        }
        this.second = s;
    }

    public String toString(){
        return String.format("%02d: %02d: %02d",this.hour,this.minute,this.second);


    }


}
