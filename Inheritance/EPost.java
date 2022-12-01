package Inheritance;

public class EPost extends Document{
    private String subject;
    private String[] to;

    EPost(String[] authors, DateInfo date, String subject, String[] to){
        super(authors, date);
        this.subject = subject;
        this.to=to;
    }

    String getSubject(){
        return this.subject;
    }

    public void getTo(){
        String arr[] = to;
        for(String t: arr){
            System.out.println(t);
        }

    }
    
}
