package check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class chk {
    public static void main(String[] args) {
        List<Integer> chk1 = new ArrayList<>(Arrays.asList(1,2,3)); // List는 인터페이스
        System.out.println(chk1.getClass().getName());
        chk1.remove(1);
        System.out.printf("chk1 Index : %s%n",chk1);
        
        ArrayList<Integer> chk2 = new ArrayList<>(Arrays.asList(1,2,3)); // ArrayList는 구현체
        Integer b = new Integer(2);
        chk2.remove(b);
        System.out.printf("chk2 Object : %s%n", chk2);
    }
}
