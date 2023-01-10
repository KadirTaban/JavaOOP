import java.util.HashSet;

public class test {

    public static void main(String[] args) {
        ///---> Değişken Tanımlaması <---\\\
        String ayrac = new String(new char[15]).replace("\0","-");

        ///---> Non-Generic HashSet Tanımlaması Gerçekleştirelim <---\\\
        HashSet set = new HashSet();

        ///---> HashSet İçerisine Değerlerini Ekleyelim <---\\\
        set.add("String Bir Değer");
        set.add(42.58); //Double değer
        set.add(true);  //Boolean değer
        set.add(null);
        set.add(25); //Integer değer

        ///---> Metot Kullanımı & Konsol Çıktısı Alımı <---\\\

        System.out.println(ayrac+"\n< Java HashSet Metotları >\n"+ayrac);
        System.out.print("-> HashSet Öğeleri: ");
        set.forEach(item -> System.out.print("["+item+"]"));
        System.out.println("\n-> Öğe Sayısı (Size): "+ set.size()+"\n"+ayrac+"\n-> Remove('String Bir Değer') Kullanımı: "+ set.remove("String Bir Değer"));
        System.out.println("-> Size Kullanımı: "+set.size());
        set.clear();
        System.out.println("-> Clear Kullanımından Sonra isEmpty: "+ set.isEmpty()+"\n"+ayrac);

    }
}