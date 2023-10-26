
public class String_01_문자의표현 {
    public static void main(String[] args) {
        char a = 'A';
        System.out.println(a);
        System.out.println((int)a);
        
        int b = 'A';
        System.out.println(b);
        
        System.out.println('9' - 48); // 문자 '0' 의 값을 빼면 문자를 숫자처럼 사용
        System.out.println('7' - '0');
        
        // 비트연산자
        System.out.println('A'^32); // XOR
        System.out.println((char)('A'^32));
        System.out.println((char)('a'^32));
    }
}
