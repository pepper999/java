package test01_bytesteam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest01 {
	public static void main(String[] args) {
		// bytestream 이라고 하는 것을 통해 파일(이미지) 한번 입출력해보자
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("dog.jpg");
//			fis = new FileInputStream(new File("dog.jpg"));
			fos = new FileOutputStream("dog-copy123.jpg");

			int b; // 읽어온 데이터

			while ((b = fis.read()) != -1) {
				fos.write(b);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//닫아주는 행위
				if(fis != null)
					fis.close();
				if(fos != null)
					fos.close();
				System.out.println("끝");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
