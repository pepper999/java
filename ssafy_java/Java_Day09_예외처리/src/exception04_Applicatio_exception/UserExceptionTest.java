package exception04_Applicatio_exception;

public class UserExceptionTest {
	public static String[] fruits = { "사과", "오렌지", "토마토" };

	public static void main(String[] args) {
//	    boolean result = getFruit1("사과");
//	    if (result) {
//	        System.out.println("먹음");
//	    } else {
//	        System.out.println("없음");
//	    }
//	    boolean result2 = getFruit1("사과");
//        if (result2) {
//            System.out.println("먹음");
//        } else {
//            System.out.println("없음");
//        }
	    
	    try {
	        getFruit2("오렌지");
	        getFruit2("오렌지");
	    } catch (FruitNotFoundException e) {
	        e.printStackTrace();
	    }
	}
	
	//1. 과일의 이름을 매개변수로 받아 존재에 따라 boolean 형태를 반환
	public static boolean getFruit1(String name) {
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] != null && fruits[i].equals(name)) {
				fruits[i] = null;
				return true;
			}
		}
		return false;
	}
	
	// 2. getFruit1을 참조하여 boolean형태의 반환이  아니라 사용자 정의 예외를 발생시킴
    public static void getFruit2(String name) throws FruitNotFoundException {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != null && fruits[i].equals(name)) {
                fruits[i] = null;
                return;
            }
        }
        throw new FruitNotFoundException(name);
    }
}
