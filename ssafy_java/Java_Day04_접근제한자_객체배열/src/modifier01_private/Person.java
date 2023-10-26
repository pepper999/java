package modifier01_private;

// class는 public 아니면 default
public class Person {
    // private : 내 클래스 내에서만 사용 가능 한 제한자
    private String name;
    private int age;

    public void info() { // 클래스 내 이므로 사용 가능
        System.out.printf("이름 : %s, 나이 : %d\n", name, age);
    }
}