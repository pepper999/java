package test07_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest01 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        
        list.add(new Person("A", "3"));
        list.add(new Person("B", "1"));
        list.add(new Person("C", "2"));

        Collections.sort(list);
        System.out.println(list);
    }
}
