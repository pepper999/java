package ploymorphism01;

public class TypeCastingTest {
    public static void main(String[] args) {
        Person p = new Person();
        Object obj = p; // 자동 형변환
        // 자손 타입 객체를 조상 타입으로 형 변환 할 수 있고 이때 생략 가능
        
        Person p2 = new Student();
//      Student st = p2; // 불가능
//      Student st = (Student) p2;
//      st.study();
        
        if (p2 instanceof Student) {
            ((Student)p2).study();
        }
    }
}
