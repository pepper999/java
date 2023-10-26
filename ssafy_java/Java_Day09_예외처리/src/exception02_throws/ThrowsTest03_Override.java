package exception02_throws;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
    public void methodA() throws IOException {
        
    }
    public void methodB() throws ClassNotFoundException{
        
    }
}

public class ThrowsTest03_Override extends Parent {
    
    @Override
    public void methodA() throws FileNotFoundException {
        
    }
    
    
    // 부모가 던지는 예외보다 더 큰 예외를 자식이 던질 수 없음
//    @Override
//    public void methodB() throws Exception {
//        
//    }

    public static void main(String[] args) {
        
    }
}
