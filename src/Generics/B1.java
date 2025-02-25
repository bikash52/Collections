package Generics;

public class B1 {
    public static void main(String[] args) {
        A1<String , Integer> a1=new A1<>("Bikash",1);
        System.out.println(a1.getId());
        System.out.println(a1.getName());

    }
}
