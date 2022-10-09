package RecursiveMethods;

public class Example {
    static int add(int x) {
        int toplam = 0;
        for(int i=1 ; i<10; i++){
            toplam += i;
        }
        return toplam;
    }
    
    static int r(int x){
        if(x==1){
            return 1;
        }
        return(x+r(x-1));
    }
    public static void main(String[] args){
        int toplam = 0;
        for(int i=1; i<=10; i++){
            toplam+=i;
        }
        System.out.println(toplam);
        System.out.println(r(10));
        
    }

    
}
