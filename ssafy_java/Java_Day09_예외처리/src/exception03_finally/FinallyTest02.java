package exception03_finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        
        
        try(FileInputStream fis2 = new FileInputStream("text.txt")) {
            // 괄호 안에서 생성된 객체는 close() 호출하지 않아도 블록을 벗어나면 close() 호출
            // AutoCloseable 인터페이스
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
    }
}
