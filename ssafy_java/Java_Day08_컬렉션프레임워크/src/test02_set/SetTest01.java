package test02_set;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        
        System.out.println(set); // 중복불가
    }

}
