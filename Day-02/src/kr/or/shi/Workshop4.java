package kr.or.shi;

public class Workshop4 {

	public static void main(String[] args) {
		//int 타입보다 작은 정수타입들(byte, short, char)은 연산할때 자동으로 int 타입으로 변환되어 연산됨.
		
		char ch = 'z';
		boolean b = (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9');
		
		System.out.println(b);

	}

}
