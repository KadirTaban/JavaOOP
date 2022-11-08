package StaticMethod.PostExec;

public class PostOffice {
    String name;

    public PostOffice(String name){
        this.name = name;

    }

    void send(Post post){
        System.out.printf("post named %s will be send from %s to %s %n", post.name, post.source, post.destination);
    }
    
    void receive(Post post){
        System.out.printf("post named %s sent from %s will be received by %s %n", post.name,post.source, post.destination);
    }
}
