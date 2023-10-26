package test02;

import com.google.gson.Gson;

public class Test1 {
    public static void main(String[] args) {
        Person p = new Person("a", 10, new String[] { "자바", "알고리즘", "자바스크립트" });
        System.out.println(p);
        Gson gson = new Gson();
        String str = gson.toJson(p);
        System.out.println(str);
    }
}
