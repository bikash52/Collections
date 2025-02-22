public class Ex11Trim {
    public static void main(String[] args) {
        String x="                aa  bb c";
        String y="/n /t /r /c";
        //Remove white spaces from start and end...
        //ltrim()-left trim.
        //rtrim()-right trim
        System.out.println(x.trim());
        System.out.println(y.trim());
    }
}
