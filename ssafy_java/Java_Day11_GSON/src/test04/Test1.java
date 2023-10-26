package test04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import com.google.gson.Gson;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data/refrigerator.json")));

        StringBuilder sb = new StringBuilder();
        String str = null;
        while ((str = br.readLine()) != null) {
            sb.append(str).append("\n");
        }
        Gson gson = new Gson();
        Refrigerator[] arr = gson.fromJson(sb.toString(), Refrigerator[].class);
        System.out.println(Arrays.toString(arr));

        arr[0].setPrice(20000000);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("data/Newrefrigerator.json")));
        String str2 = gson.toJson(arr);
        bw.write(str2);
        bw.close();

    }
}
