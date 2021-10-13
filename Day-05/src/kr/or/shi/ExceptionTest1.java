package kr.or.shi;

//프로그램이 실행되다가 오류가 발생하면 프로그램이 비정상적으로 종료됨.
//즉, 더 이상 프로그램이 실행되지 않는다.

//프로그램 상에 예외가 발생되도록 프로그램이 계속 실행되게 하려면
//예외처리를 해주어야 함.
//try{
// 예외가 발생할 만한 코드;
//}
//catch(예외타입 변수){
//예외처리
//}
//만약, try 안에서 발생하는 예외 종류가 많으면
//다중 catch 구문을 사용해서 여러개의 예외를 처리할 수 있다. 2.
public class ExceptionTest1 {

	public static void main(String[] args) {
		
		/*System.out.println("프로그램 시작");
		try {
		int result = 10/0; //예외발생
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨.");
		}
		System.out.println("프로그램이 계속 실행되나?");*/

		//다중 catch 구문
		System.out.println("프로그램 시작");
		try {
		int number = Integer.parseInt(args[0]);
		int result = 10/0; //예외발생
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨.");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인자를 입력하세요.");
		}
		catch(Exception e) {
			System.out.println("예외 발생");
		}
		System.out.println("프로그램이 계속 실행되나?");
	}

}
