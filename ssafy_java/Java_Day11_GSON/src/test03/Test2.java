package test03;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Test2 {
    public static void main(String[] args) {
        String str = "[{\"name\":\"a\",\"age\":10},{\"name\":\"b\",\"age\":20},{\"name\":\"c\",\"age\":30},{\"name\":\"d\",\"age\":40},{\"name\":\"e\",\"age\":50}]\r\n";
        Gson gson = new Gson();
        Person[] arr = gson.fromJson(str, Person[].class);
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
