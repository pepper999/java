public class Stack_07_재귀함수 {
    public static int cnt = 0;
    public static void main(String[] args) {
//        func1();
        func2(10);
    }
    
    public static void func1() {
        // 무한히 호출 되어야 할 것 같지만
        // 적당히 할당한 매모리가 있다. 넘치면 멈춘다
        System.out.println("함수 내부");
        cnt++;
        func1();
    }
    
    public static void func2(int num) {
        // 1. 기본파트 : 재귀함수 종료조건 작성
        if (num == 0) {
            return;
        }
        System.out.println(num + " 함수호출");
        func2(num - 2);
        System.out.println(num + " 함수리턴");
        // 2. 재귀파트 : 나 자신 (자신처럼 보이는 ) 부분을 다시 호출
        
    }
}
