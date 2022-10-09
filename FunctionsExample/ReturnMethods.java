package FunctionsExample;

public class ReturnMethods {
    static int power(int a, int b) {
        int result = 1 ;

        for(int i=1; i <= b; i++){
            result *=a;
        }
        return result;
    }

    static void power2(int a, int b){
        int result = 1;
        
        for(int i = 1; i<=b ; i++){
            result *=a;
        }
        System.out.println(result);

    }
    public static void main(String[] kadir){
        int result2 = power(10,2);
        System.out.println(result2);
    }    
}
