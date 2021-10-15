package kr.or.shi;

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;

//FileInputStream
//바이트기반스트림, 기본스트림
public class FileInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		byte[] readContent = new byte[500];
		//파일로부터 읽어들인 내용을 저장할 배열객체
		byte[] consoleFileName = new byte[100];
		//사용자가 입력한 파일명을 저장할 배열객체
		
		try {
			System.out.println("파일명 : ");
			System.in.read(consoleFileName);
			String fileName = new String(consoleFileName);
			
			
			fis = new FileInputStream(fileName);
			fis.read(readContent, 0, readContent.length);
			System.out.println(new String(readContent).trim());
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
