public class Ex4 {
    public static void main(String[] args) {
        String x="Bikash";
        String y=new String("Bikash").intern();//intern() helps to manually move into String pool
        System.out.println(x==y);//true
        System.out.println(x.equals(y));//true
    }
}
