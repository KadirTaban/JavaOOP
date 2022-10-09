package FunctionsExample;

public class PalindromesNumber {

    static boolean isPalindrome(int input){
        int tmp, tersSayi=0,kalan;
        tmp = input;
        while(tmp!=0){
            kalan = tmp % 10;
            tersSayi = tersSayi * 10 + kalan;
            tmp /= 10;

        }
        if(input == tersSayi)
            return true;
        else 
            return false;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(123));
    }
 
    
}
