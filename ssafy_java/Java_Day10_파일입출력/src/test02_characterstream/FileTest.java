package test02_characterstream;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		//File : 실제 file 혹은 폴더를 관리하기 위한 class
		File f = new File("big_input.txt");
		System.out.println(f.getPath());
		System.out.println(f.getName());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
	}
}
