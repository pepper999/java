package test06_final;

public class Test {
    public static void main(String[] args) {
        Student st = new Student("양띵균", 45, "컴퓨터전공");
        Student st2 = new Student("양띵균", 45, "컴퓨터전공");
        Student st3 = new Student("양띵균", 55, "법학전공");

        System.out.println(st);
        System.out.println(st.toString());
        System.out.println(st == st2);
        System.out.println(st.equals(st2));
        System.out.println(st.equals(st3));
    }
}
