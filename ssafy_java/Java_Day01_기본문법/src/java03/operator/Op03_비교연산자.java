package java03.operator;

public class Op03_비교연산자 {
    // 이상, 이하, 초과, 미만 구분할 것
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a > 10);
        System.out.println(a != 10);
        System.out.println(a >= 10);

        System.out.println(a == 10);
        System.out.println(a != 10);

        // 문자열은 어떻게 비교하는가??
        String c = "Hi";
        String d = "Hi";
        String e = new String("Hi");
    }
}
