import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        int number;
        Scanner var = new Scanner(System.in);
        number = var.nextInt();
        int sonuc ;
        int bolen = (number-1); 
        int temp = 0;
        while(number!=0){
            if(bolen==0){
                break;
            }
            
            sonuc = number%bolen;           
            if(sonuc == 0){
                temp = temp+bolen ;
            }
            bolen--;
        }
        System.out.println(temp);
        
    }
    
}
