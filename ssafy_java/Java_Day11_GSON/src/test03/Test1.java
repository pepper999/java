package test03;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Test1 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("a", 10));
        list.add(new Person("b", 20));
        list.add(new Person("c", 30));
        list.add(new Person("d", 40));
        list.add(new Person("e", 50));
        System.out.println(list);
        Gson gson = new Gson();

        String str = gson.toJson(list);
        System.out.println(str);
    }
}
