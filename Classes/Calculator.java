package Classes;

public class Calculator {
    public int sayi1;
    public int sayi2;

    Calculator(int sayi1, int sayi2){
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;

    }
    public int toplama(){
        return this.sayi1 + this.sayi2;

    }

    public int cikarma() {
        return this.sayi1 - this.sayi2;
    }
    
    public int carpma() {
        return this.sayi1 * this.sayi2;
    }

    public int bolme() {
        return this.sayi1 / this.sayi2; 
    }
}
