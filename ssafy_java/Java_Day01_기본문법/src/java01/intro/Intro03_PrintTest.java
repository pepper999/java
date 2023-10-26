package java01.intro;

public class Intro03_PrintTest {
    public static void main(String[] args) {
        // print 를 써보자.
        System.out.print("Hello World");
        // \n 이라는것을 사용하면 줄이 바뀐다.
        // println을 써보자.
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");

        System.out.println("\\");
        System.out.println("\"");

        System.out.printf("%d \n", 10); // 정수 (10진수)
        System.out.printf("%o \n", 10); // 정수 (8진수)
        System.out.printf("%X \n", 10); // 정수 (16진수)
        System.out.printf("%x \n", 10); // 정수 (16진수)

        System.out.printf("%4d\n", 10); // 4칸을 확보한뒤 오른쪽부터 차지
        System.out.printf("%-4d\n", 10); // 4칸을 확보한뒤 왼쪽부터 차지
        System.out.printf("%04d\n", 10); // 4칸을 확보한뒤 오른쪽부터 차지(빈칸 0을채운다.)

        System.out.printf("%f\n", 10.1); // 실수
        System.out.printf("%.2f\n", 10.1); // 실수 (소수점 둘째자리까지)

        System.out.printf("%s\n", "양명균");
        System.out.printf("%c\n", 'o');

        System.out.printf("|%10s" + "안녕|");

    }
}
