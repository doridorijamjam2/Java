package kr.or.shi;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

//문자 기반 스트림 : Reader
public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("fileReader.txt");
			int readChar = -1;
			//FileReader의 read() 메소드는 문자하나(문자코드)를 읽어서
			//int 타입으로 반환. A --> 65
			//읽은 값이 없으면 -1 반환
			while((readChar = fr.read()) != -1) {
				System.out.print((char)readChar);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}

}
