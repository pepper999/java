package test06_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        
        names.add("C");
        names.add("F");
        names.add("A");
        names.add("B");
        names.add("E");
        
        System.out.println(names);
        Collections.sort(names); // 배열 정렬은 Arrays.sort()
        System.out.println(names);
    }
}
