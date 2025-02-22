import java.util.ArrayList;

public class Ex23 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Mango");
        arr.add("Orange");
        arr.add("WaterMelon");
        System.out.println(arr);
        System.out.println(arr.size());//Size of the array
        arr.add(3,"PineApple");
        System.out.println(arr);
        arr.remove(4);//Remove the element
        System.out.println(arr);
        arr.set(3,"Grapes");
        System.out.println(arr);
        System.out.println(arr.getFirst());
        System.out.println(arr.removeLast());
        System.out.println(arr.get(3));
        System.out.println(arr.reversed());
    }
}
