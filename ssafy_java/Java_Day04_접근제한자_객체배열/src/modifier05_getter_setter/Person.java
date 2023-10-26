package modifier05_getter_setter;

public class Person {
    private String name;
    private int age;
    private boolean hungry;

    // 생성자를 이용하여 인스턴스 변수 초기화
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // setter & getter
    // setter (설정자) : set멤버변수명 // 관례
    public void setName(String name) {
        this.name = name;
    }

    // getter(접근자) : get멤버변수명 // 관례
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 이런 방식으로 사용 시 조건을 제한하거나 후처리 하기가 좋다
    public void setAge(int age) {
        if (age < 0 || age > 110) {
            System.out.println("음수 금지");
            return;
        }
        this.age = age;
    }

    // boolean 타입의 getter는 is를 사용
    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

}
