package test02;

import com.google.gson.Gson;

public class Test2 {
    public static void main(String[] args) {
        String str = "{\"name\":\"a\",\"age\":10,\"hobbies\":[\"자바\",\"알고리즘\",\"자바스크립트\"]}\r\n";
        Gson gson = new Gson();
        Person p = gson.fromJson(str, Person.class);
        System.out.println(p);
    }
}
