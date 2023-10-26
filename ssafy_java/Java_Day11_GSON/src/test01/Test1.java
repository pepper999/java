package test01;

import com.google.gson.Gson;

public class Test1 {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Person p1 = new Person("a", 10);
        Person p2 = new Person("b", 20);
        Person p3 = new Person("c", 30);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        String p1str = gson.toJson(p1);
        String p2str = gson.toJson(p2);
        String p3str = gson.toJson(p3);

        System.out.println(p1str);
        System.out.println(p2str);
        System.out.println(p3str);

    }
}
