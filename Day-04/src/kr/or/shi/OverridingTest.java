package kr.or.shi;

//overriding
//부모클래스에서 상속받은 메소드, 변수는 자식클래스에서 자기자신에 맞게 재정의해서 사용할수 있다.
//자식클래스에 재정의된 부모 클래스이 메소드는 은폐된다.
class Super{
	int money = 100;
	
	void superMethod() {
		System.out.println("super");
	}
}

class Sub extends Super{
	String money = "100원";
	@Override
	void superMethod() {
		// TODO Auto-generated method stub
		System.out.println("overriding method");
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		sub.superMethod();
		sub.money = "100원";
		

	}

}
