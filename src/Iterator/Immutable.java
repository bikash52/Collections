package Iterator;

import java.util.List;

public class Immutable {
    public static void main(String[] args) {
        Immutable a1=new Immutable();
        List<Long> m=List.of(9114165927L,8328857252L);
        a1.addMoney(m);
    }

    public void addMoney(List<Long>x){
//        x.add(9937639742L);
        for(Long l:x){
            System.out.println("5000Added");
        }
    }
}
