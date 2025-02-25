package String;

public class Ex19Concat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!";


        System.out.println(str1.concat("").concat(str2.concat("").concat(str3)));
    }
}
