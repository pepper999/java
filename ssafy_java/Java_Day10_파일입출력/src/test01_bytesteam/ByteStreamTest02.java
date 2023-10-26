package test01_bytesteam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest02 {
	public static void main(String[] args) {
		// bytestream 이라고 하는 것을 통해 파일(이미지) 한번 입출력해보자

		// try with resources
		try (FileInputStream fis = new FileInputStream("dog2.jpg");
				FileOutputStream fos = new FileOutputStream("dog-copy2.jpg");) {
			int b; // 읽어온 데이터
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("끝");
		System.out.println("스트림은 알아서 닫혔습니다.");

	}
}
