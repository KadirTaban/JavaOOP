package Inheritance;

public class Document {
    private String[] authors;
    private DateInfo date;

    Document(String[] authors, DateInfo date){
        this.authors = authors;
        this.date = date;
    }

    public String[] getAuthors(){
        return authors;
    }
  
    public void addAuthor(String name){
        String[] authorArray = new String[this.authors.length+1];
        int i;
        for(i = 0; i<this.authors.length; i++ ){
            authorArray[i] = this.authors[i];
        }
        authorArray[i] = name;
        this.authors = authorArray;
    }

    public date getDate(){
        return this.date;
    }
    
    public void getAuthor(){
        String arr[] = authors;
        for(String t: arr){
            System.out.printf(t+" ");
        }
    }
}

