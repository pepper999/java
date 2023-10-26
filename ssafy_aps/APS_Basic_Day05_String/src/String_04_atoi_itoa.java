
public class String_04_atoi_itoa {
    public static void main(String[] args) {
        String sNum = "1234";
        int num = Integer.parseInt(sNum.trim());
        System.out.println(num);
        
        String sNum2 = "-1234";
        int num2 = Integer.parseInt(sNum2.trim());
        System.out.println(num2);
        
        String sNum3 = "       1234"; // trim : 왼쪽 오른쪽 공백 제거
        int num3 = Integer.parseInt(sNum3.trim());
        System.out.println(num3);
        
        int num4 = -1234;
        String sNum4 = String.valueOf(num4);
        System.out.println(sNum4);
        
        int num5 = 1234;
        String sNum5 = num5 + "";
        System.out.println(sNum5);
        
        System.out.println(atoi(sNum5));
        
        
    }
    
    public static int atoi(String text) {
        int value = 0;
        int digit = 0;
        for (int i = 0; i < text.length(); i++) {
            char num = text.charAt(i);
            if (num >= '0' && num <= '9') {
                digit = num - '0';
            }
            value = (value * 10) + digit;
        }
        return value;
    }
}
