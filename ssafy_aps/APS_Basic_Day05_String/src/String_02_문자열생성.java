
public class String_02_문자열생성 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        
        System.out.println(str1);
        System.out.println(str2);
        
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        
        String str3 = "abc";
        String str4 = str2;
        String str5 = str3;
        
        System.out.println(str1 == str3);
        System.out.println(str2 == str4);
        System.out.println(str3 == str5);
        
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str4));
        System.out.println(str3.equals(str5));
    }
}
