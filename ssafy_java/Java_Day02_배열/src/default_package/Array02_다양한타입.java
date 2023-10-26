package default_package;

public class Array02_다양한타입 {
    public static void main(String[] args) {
        boolean[] bArr = new boolean[5];
        char[] cArr = new char[5];
        float[] fArr = new float[5];
        String[] sArr = new String[5];

        System.out.println(bArr[0]); // false
        System.out.println(cArr[0]); // \u0000
        System.out.println(fArr[0]); // 0.0
        System.out.println(sArr[0]); // null
    }
}
