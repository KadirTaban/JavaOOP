package StaticMethod.PostExec;

public class Main {
    public static void main(String[] args) {

        Post post = new Post("Selam Mektubu","Savsat Yazihanesi","Bursa Esenevler");
        PostOffice po1 = new PostOffice("Bursa PTT");
        po1.send(post);

        PostOffice po2 = new PostOffice("Savsat PTT");  
        po2.receive(post);      
    }
    
}
