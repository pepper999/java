package test02_characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
////요거 가능
//try {
//	
//} finally {
//	
//}
public class CharacterStreamTest01 {
	public static void main(String[] args) throws IOException {
		// 문자 입출력 Reader Writer

		try (FileReader reader = new FileReader("big_input.txt");
				FileWriter writer = new FileWriter("big_input_copy.txt")) {
			
//			char[] buffer =new char[10]; 아까위의 ByteStreamTest03 처럼 버퍼로도 바꿀수있다.
			
			int c; 
			while((c= reader.read()) != -1) {
				writer.write(c);
			}
		}
		
		System.out.println("복사끝");
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}
}
