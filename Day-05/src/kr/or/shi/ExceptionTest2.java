package kr.or.shi;

/*try {
	
}
catch{
	
}
finally {
	프로그램에서 반드시 실행되어야 하는 코드를 삽입하는 부분
	이 부분은 JVM이 죽지 않는 한 반드시 실행된다.
}*/

public class ExceptionTest2 {
	
	public void exceptionMethod(String[] args) {
		
		try {
		int number = Integer.parseInt(args[0]);
		int result = 10/0; //예외발생
		return;
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨.");
			return;
		}
		catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요.");
			return;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인자를 입력하세요.");
			return;
		}
		catch(Exception e) {
			System.out.println("예외 발생");
		}
		finally {
		System.out.println("반드시 실행되어야 하는 부분");
		}
	}

	public static void main(String[] args) {
		ExceptionTest2 et2 = new ExceptionTest2();
		et2.exceptionMethod(args);

	}

}
