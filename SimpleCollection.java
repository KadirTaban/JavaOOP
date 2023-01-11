import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection <Integer> c = new ArrayList();

        c.add(5);
        c.add(4);
        c.add(3);

        Iterator iter = c.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
