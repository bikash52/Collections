package String;

public class Ex12charAt {
    public static void main(String[] args) {
        String z="aabnjaaannasbaoaualaala";
        int count=0;
        for(int i=0; i<z.length()-1; i++){
            //charAt-count the no. of characters
            if(z.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
