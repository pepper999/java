package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class boj7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        TreeMap<String, Integer> infos = new TreeMap<>((a, b) -> b.compareTo(a)); // TreeMap ���� �� Comparator ����
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String info = st.nextToken();
            if (info.equals("enter")) {
                infos.put(name, 0);
            } else {
                infos.remove(name);
            }
        }
        
        // ���ĺ� �������� Ű ���
        for (String key : infos.keySet()) {
            System.out.println(key);
        }
    }
}
