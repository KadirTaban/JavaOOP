package Inheritance;

import javax.security.auth.Subject;

public class Main {
    public static void main(String[] args) {
        Document document = new Document(new String[] {"kadir","ömer"} , new DateInfo(2, 3, 2005));
        System.out.println(document.getAuthors());
        document.addAuthor("Sevda");//new author name 

        String arr[] = document.getAuthors();

        for(String s:arr){
            System.out.println(s);
        }


        EPost email = new EPost(new String[] {"kadir","ömer"} , new DateInfo(02, 03, 2005),"Karabuk Univ",new String[] {"e-yoklama technical issue."});
        System.out.println(email.getSubject());
        email.getTo();
        
        Book book = new Book(new String[]{"Naci","Safiye"},new DateInfo(02, 01, 2001), "Masumlar Apartmanı");
        book.getAuthor();
    }

    
}
