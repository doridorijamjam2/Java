package kr.or.shi.system;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.print("알파벳 하나를 입력하고 [Enter]를 누르세요. : ");
		
		int i;
		
		try {
			i = System.in.read();
			System.out.println(i);
			
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e);
		}
		

	}

}
