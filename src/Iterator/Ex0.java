package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex0 {
    public static void main(String[] args) {
        List<String> arr=new ArrayList<>();
        arr.add("Apple");
        arr.add("Orange");
        arr.add("Mango");

//        Iterator<String> val=arr.iterator();
//        while(val.hasNext()){
//            String x=val.next();
//            System.out.println(x);

        for(String x: arr){
            System.out.println(x);
        }
    }
}
