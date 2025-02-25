package String;

public class Ex16{
    public static void main(String[] args) {

        String s="hello buddy b where are you";
        System.out.println(s.indexOf("buddy"));//6
        System.out.println(s.indexOf("b"));//consider the first b
        System.out.println(s.indexOf('b',7));//consider the b after 7
    }
}
