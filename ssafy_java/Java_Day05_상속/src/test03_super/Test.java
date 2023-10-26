package test03_super;

public class Test {
    public static void main(String[] args) {
        Student st = new Student("양띵균", 45, "컴퓨터전공");
        System.out.println(st.age);
        st.study();
        System.out.println(st.age);
    }
}
