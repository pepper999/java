package test08_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest01 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        
        list.add(new Person("A", "3"));
        list.add(new Person("B", "1"));
        list.add(new Person("C", "2"));
        Comparator comparator =new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.parseInt(p2.id) - Integer.parseInt(p1.id);
            }};
        Collections.sort(list, comparator);
        System.out.println(list);
    }
}
