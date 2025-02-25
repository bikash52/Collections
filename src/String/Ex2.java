package String;

public class Ex2 {
    public static void main(String[] args) {
        String x=new String("Bikash");
        String y=new String("Bikash");
        System.out.println(x==y);//False because object address is different
        System.out.println(x.equals(y));//True because both values are equal
    }
}
