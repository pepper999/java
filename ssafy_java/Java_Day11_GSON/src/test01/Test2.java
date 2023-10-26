package test01;

import com.google.gson.Gson;

public class Test2 {
    public static void main(String[] args) {
        Gson gson = new Gson();

        String str1 = "{\"name\":\"a\",\"age\":10}";
        String str2 = "{\"name\":\"b\",\"age\":20}";
        String str3 = "{\"name\":\"c\",\"age\":30}";

        Person p1 = gson.fromJson(str1, Person.class);
        Person p2 = gson.fromJson(str2, Person.class);
        Person p3 = gson.fromJson(str3, Person.class);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
