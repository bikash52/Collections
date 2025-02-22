public class Ex22 {
    public static void main(String[] args) {
        //AutoBoxing
        Integer x1=10;
        Character x2='b';
        Float x3=2.5f;
        Double x4=3.8;
        boolean x5=true;
        String x6="Hello World";

        int x7=x1;//Unboxing

        System.out.println(x7);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        System.out.println(x6);

        //valueOf()-Converting premitive datatype to wrapper
        Integer x=Integer.valueOf(20);
        System.out.println(x);
    }
}
