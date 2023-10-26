package abstractclass03;

public abstract class Chef {
    String name;
    int age;
    String speciality;
    
    public void eat() {
        System.out.println("음식을 먹는다.");
    }
    
    public abstract void cook(); // 무조건 재정의가 필요한 추상클래스

}
