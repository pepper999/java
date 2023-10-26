package modifier06_singleton;

public class Person {
    // 싱글턴패턴 : 생성자가 여러 차례 호출 되어도 생성되는 객체는 하나이고 이후 호출에는 생성 된 객체가 리턴
    // 일단 가지고 있기
    private static Person instance = new Person();

    // 외부에서 생성하지 못하게 제한하기
    // 기본 생성자 작성 후 접근 제한자를 private하게 만들기
    private Person() {
    }

    // 외부에서 나의 instance를 사용 가능 하도록 처리
    // 외부에서 가져다 쓰기 위해 메모리에 미리 올리기 위해 static 사용
    // 아래 public에만 static 사용 시 외부 instance 못가져 오므로 외부에도 static
    public static Person getInstance() {
        // 6번 라인 대신 아래와 같이 작성 가능
//		if (instance == null)
//			instance = new Person();
        return instance;
    }
}
