package String;

public class Ex8 {
    public static void main(String[] args) {
        String x="Bikash";
        String y="Bikash";
        String z="bikash";
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));//Case insensitive
        System.out.println(x.equalsIgnoreCase(z));//equalsIgnoreCase case sensitive
    }
}
