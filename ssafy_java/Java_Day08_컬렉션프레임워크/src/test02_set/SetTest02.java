package test02_set;

import java.util.HashSet;
import java.util.Set;

public class SetTest02 {
    public static void main(String[] args) {
        Set <Person> set = new HashSet<>();
        Person p1 = new Person("A","123");
        Person p2 = new Person("A","123");
        
        set.add(p1);
        set.add(p2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(set);
        // HashSet은 hashcode 비교 -> 동일한 경우 equals 비교 
        // Person 클래스에서 hashcode, equals 를 override 시켜서 중복값으로 처리함
        // override 없는 경우 다른 객체로 인식함
    }
}
