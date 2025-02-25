package Generics;

public class B {
    public static void main(String[] args) {
        A a1=new A(100,1);//Name is 100,which is wrong
        System.out.println(a1.getId());
        System.out.println(a1.getName());
    }
}
