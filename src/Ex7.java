public class Ex7 {
    public static void main(String[] args) {
        String x="   ";
        System.out.println(x.isBlank());//true-whitespaces are ignored
        System.out.println(x.isEmpty());//false-whitespaces are not ignored
        System.out.println(x.length());//0
    }
}
