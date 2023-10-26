package check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class chk4 {
    public static void main(String[] args) {
        // int는 자료형 Integer는 래퍼클래스
        int[] chk1 = {1,2,3};
        
        // 불가능
        // List<Integer> chk2 = new ArrayList<>(Arrays.asList(chk1));
        
        // 반복문 사용
        List<Integer> chk3 = new ArrayList<>();
        for (int e : chk1) {
            chk3.add(e);
        }
        System.out.println(chk3);
        System.out.println(chk3.getClass().getName());
        
        // Stream
        List<Integer> chk4 = Arrays.stream(chk1).boxed().collect(Collectors.toList());
        System.out.println(chk4);
        System.out.println(chk4.getClass().getName());
        
        // boolean은 자료형 Boolean은 래퍼클래스
        boolean[] chk5 = {true, false, true};
        
        // 불가능
        // List<Boolean> chk6 = new ArrayList<>(Arrays.asList(chk3));
        
        // 반복문 사용
        List<Boolean> chk7 = new ArrayList<>();
        for (boolean e : chk5) {
            chk7.add(e);
        }
        System.out.println(chk7);
        System.out.println(chk7.getClass().getName());
        
        // Stream은 boolean은 불가능 double int long T
        // List<Boolean> chk8 = Arrays.stream(chk5).boxed().collect(Collectors.toList());
    }
}
