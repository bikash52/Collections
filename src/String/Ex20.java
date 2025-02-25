package String;

public class Ex20 {
    public static void main(String[] args) {
        String str = "System is running";
        String s1=str.substring(2,5);
        String s2=str.substring(2,5).toUpperCase();
        String s3=str.substring(2);
        String s4=str.substring(0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
