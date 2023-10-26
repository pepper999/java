
public class String_05_패턴매칭 {
    public static void main(String[] args) {
        String t = "This iss a book";
        String p = "iss";
        System.out.println(bruteForceFor(t, p));
        System.out.println(bruteForceWhile(t, p));
    }
    
    public static int bruteForceFor(String t, String p) {
        int N = t.length();
        int M = p.length();
        for (int i = 0; i < N - M + 1; i++) {
            boolean flag = true;
            for (int j = 0; j < M; j++) {
                if (p.charAt(j) != t.charAt(i + j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
    
    public static int bruteForceWhile(String t, String p) {
        int N = t.length();
        int M = p.length();
        int i = 0;
        int j = 0;
        while (j < M && i < N) {
            if (t.charAt(i) != p.charAt(j)) {
                i -= j;
                j = -1;
            }
            i++;
            j++;
        }
        if (j == M) {
            return i - M;
        }
        return -1;
    }
}
