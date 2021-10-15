package kr.or.shi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//데이터를 출력하는 파일이 존재하지 않으면 해당 파일을 만들면서 출력한다.
//디렉토리 자체가 없으면 예외발생함.
public class FileOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("fileout.txt",true);
			String message = "Hello FileOutputStream!!!";
			fos.write(message.getBytes());
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
