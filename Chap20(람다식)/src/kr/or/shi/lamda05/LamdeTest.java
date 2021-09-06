package kr.or.shi.lamda05;

public class LamdeTest {

	public static void main(String[] args) {
		
		MyInterface myInterface = null;
		
		myInterface = (x, y) -> {
			int result = x + y;
			return result;
		};
		int result = myInterface.method(100, 200);
		System.out.println("매개변수 2개와 리턴값 있는 람다식의 값 : " + result);
		
		myInterface = (x, y) -> {return x + y;};
		result = myInterface.method(300, 200);
		System.out.println("매개변수 2개와 리턴값 있는 람다식의 값 : " + result);
		
		myInterface = (x, y) -> x + y;
		result = myInterface.method(1000, 200);
		System.out.println("매개변수 2개와 리턴값 있는 람다식의 값 : " + result);
		
		myInterface = (x, y) -> add(x, y);
		result = myInterface.method(700, 200);
		System.out.println("매개변수 2개와 리턴값 있는 람다식의 값 : " + result);
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
}
