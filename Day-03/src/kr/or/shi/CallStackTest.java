package kr.or.shi;

//자바에서 메소드를 실행하면 현재 실행되는 메소드가 CallStack의 top부분을 차지하면서 실행된다
//특정 메소드가 실행을 완료하면 바로 밑의 CallStack을 확보하고 있는 메소드가 실행된다.
public class CallStackTest {

	public static void main(String[] args) {
		System.out.println("main start");
		firstMethod();
		System.out.println("main end");

	}

	private static void firstMethod() {
		System.out.println("first start");
		secondMethod();
		System.out.println("first end");
		
	}

	private static void secondMethod() {
		System.out.println("second start");
		System.out.println("second end");
		
	}

}
