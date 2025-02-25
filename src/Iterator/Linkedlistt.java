package Iterator;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistt {
    public static void main(String[] args) {
        List<String> l=new LinkedList<>();
        l.add("Apple");
        l.add("Banana");
        l.add("Blackberry");

        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.removeLast());
        System.out.println(l);
        System.out.println(l.get(0));
        System.out.println(l.get(1));
    }
}
