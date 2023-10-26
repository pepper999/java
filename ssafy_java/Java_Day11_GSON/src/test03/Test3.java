package test03;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Test3 {
    public static void main(String[] args) {
        String str = "[{\"name\":\"a\",\"age\":10},{\"name\":\"b\",\"age\":20},{\"name\":\"c\",\"age\":30},{\"name\":\"d\",\"age\":40},{\"name\":\"e\",\"age\":50}]\r\n";
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Person>>() {
        }.getType();
        List<Person> list = gson.fromJson(str, List.class);
        List<Person> list2 = gson.fromJson(str, listType);
        System.out.println(list);
        System.out.println(list2);
    }
}
