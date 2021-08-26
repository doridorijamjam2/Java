package kr.or.shi.operator;

public class OperatorTest {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result = v1 + v2;
		System.out.println("더하기 결과 : " + result);
		
		result = v1 - v2;
		System.out.println("빼기 결과 : " + result);
		
		result = v1 * v2;
		System.out.println("곱하기 결과 : " + result);
		
		result = v1 / v2;
		System.out.println("나누기 결과 : " + result);
		
		result = v1 % v2;
		System.out.println("나머지 결과 : " + result);

		

	
		
		//예외 처리코드
		try {
			result = v1 / 0;     // 산술연산예외가 발생
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.toString());
		}

	}

}
