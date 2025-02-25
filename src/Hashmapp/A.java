package Hashmapp;

import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<>();
        m.put("9114165278",1254);
        m.put("8325283260",6539);
        m.put("8325283264",5989);
        System.out.println(m);

        System.out.println(m.remove("8325283260"));//Remove the key it will print the value
        System.out.println(m);
    }
}
