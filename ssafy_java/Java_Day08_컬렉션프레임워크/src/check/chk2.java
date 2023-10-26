package check;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class chk2 {
    public static void main(String[] args) {
        String[] chk5 = {"A","B","C"};
        List<String> chk6 = new ArrayList<>(Arrays.asList(chk5));
        System.out.println(chk6);
        System.out.println(chk6.getClass().getName());
        List<String> chk7 = Arrays.asList(chk5);
        System.out.println(chk7);
        System.out.println(chk7.getClass().getName());
        
    }
}
