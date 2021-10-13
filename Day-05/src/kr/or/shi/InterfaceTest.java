package kr.or.shi;

//상속
//자바에서는 클래스 단위는 단일상속만 지원함.
//상속구조의 모호성을 회피하기 위해서이다.
//인터페이스는 다중상속이 지원되고, 클래스에서 인터페이스를 구현할때 필요한 만큼 구현해서 사용할수 있다.
//인터페이스는 상속구조가 모호해질 우려가 없다.

interface Inter1{
	int x = 10;
	void in1Method();
}

interface Inter2{
	int x = 10;
	void in1Method();
	void in2Method();
}

interface Inter3 extends Inter1, Inter2{
	
}

class Inter3Impl implements Inter3{

	@Override
	public void in1Method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void in2Method() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter3Impl inter3 = new Inter3Impl();
		inter3.in2Method();

	}

}
