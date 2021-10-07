package kr.or.shi;

public class InitialBlockTest {
	static {
		//static 초기화블록
		//클래스가 로딩될때 단한번 실행
		//main 메소드보다 먼저 실행
		//주로 static 변수값이나 상수값을 초기화 시킬때 사용됨
		System.out.println("static{   }");
	}
	
	{
		//인스턴스 초기화블록
		//객체를 생성할때마다 생성자가 호출되기 직전에 실행
		//객체를 만들때 반복적으로 실행해야 하는 명령을 정의
		System.out.println("{   }");
	}
	
	public InitialBlockTest() {
		// TODO Auto-generated constructor stub
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		System.out.println("main start");
		InitialBlockTest ib1 = new InitialBlockTest();
		InitialBlockTest ib2 = new InitialBlockTest();

	}

}
