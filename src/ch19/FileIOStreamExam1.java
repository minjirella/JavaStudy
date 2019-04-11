package ch19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamExam1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("c:/test.txt");
			fos = new FileOutputStream("D:/test_out.txt");
//			int data = fis.read();
//			System.out.println((char) data);
//			data = fis.read();
//			System.out.println((char) data);
//			data = fis.read();
//			System.out.println((char) data);
//			data = fis.read();
//			System.out.println((char) data);
//			data = fis.read();
//			System.out.println((char) data);
//			data = fis.read();
//			System.out.println(data);
//			위 소스 내용으로 어떤 파일의 마지막추출값은 -1이라는걸 알수있다.
			
			int data = 0;
			byte[] buffer = new byte[1024];
			while(true) {
				data = fis.read(buffer);
				fos.write(data);
				if(data == -1) break;
				System.out.println((char)data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
