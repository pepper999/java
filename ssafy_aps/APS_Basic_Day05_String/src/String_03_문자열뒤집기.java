import java.lang.reflect.Array;
import java.util.Arrays;

public class String_03_문자열뒤집기 {
    public static void main(String[] args) {
        String text = "안녕하세요 반갑습니다";
        char[] str = new char[text.length()];
        for (int i = text.length() - 1, idx = 0; i >= 0; i--, idx++) {
            str[idx] = text.charAt(i);
        }
        System.out.println(Arrays.toString(str));
        
        char[] str2 = text.toCharArray();
        int len = str2.length;
        for (int i = 0; i < len / 2; i++) {
            char temp = str2[i];
            str2[i] = str2[len - 1 - i];
            str2[len - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(str2));
        
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.reverse();
        System.out.println(sb.toString());
        
        StringBuffer sb2 = new StringBuffer(text);
        String reverse = sb2.reverse().toString();
        System.out.println(reverse);
        
    }
}
