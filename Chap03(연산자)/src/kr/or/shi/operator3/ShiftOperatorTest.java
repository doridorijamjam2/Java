package kr.or.shi.operator3;

public class ShiftOperatorTest {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 1;
		
		//Shift 연산은 그래픽분야에서 많이 사용함. -- 이유: 고속처리가 가능.
		System.out.println(" 8 << 2 : " + (a << b));
		System.out.println(" 8 << 2 : " + (a >> b));
	}

}
