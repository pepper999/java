package practice;

public class reference {
	public static void main(String[] args) {
		String hello = "안녕";
		String hi = new String("안녕");
		if("안녕".equals("안녕")) {
			System.out.println("1"); // true
		}
		if(hello.equals("안녕")) {
			System.out.println("2"); // true
		}
		if("안녕" == "안녕") {
			System.out.println("3"); // true
		}
		if(hello == "안녕") {
			System.out.println("4"); // true
		}
		if(hello == hi) {
			System.out.println("5"); // false
		}
		
		// 문자열 상수풀 : 문자열이 할당 되고 나면 같은 값을 호출 할때 동일 주소로 가서 가져온다
		// 참조란 동일한 값을 가지는 주소를 가지는것
		// 메모리 주소값을 변수에 저장
		// 윈도우 바로가기와 같음
		// 복제와 다름
		
		
	}
}
