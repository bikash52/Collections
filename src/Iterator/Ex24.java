package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Ex24 {
    public static void main(String[] args) {
        List<Long> numbers = new ArrayList<>();
        numbers.add(9114165927L);
        numbers.add(8328857252L);
        numbers.add(9776368731L);
        numbers.add(9537880257L);

        Ex24 a1 = new Ex24();
        a1.addMoney(numbers);
    }
    public void addMoney(List<Long>x){
        x.add(9114112345L);
        for(Long l:x){
            System.out.println("Rs 5000 added");
        }

    }
}
