package kr.or.shi;
//this
//자기 자신 객체를 참조하는 래퍼런스 변수
//일반적인 경우에는 사용할 필요가 없다.

//this를 사용하는 경우는
//멤버변수명과 파라미터변수명이 동일한경우에
//좌측의 변수가 멤버변수임을 지정하기 위한 경우이다. 1)

public class ThisTest{
	//1.
	int x = 10;
	public ThisTest(int x) {
		//멤버변수명과 파라미터 변수명이 동일하면 파라미터 변수가 우선 인식됨.
		
		//만약 좌측의 변수를 멤버변수로 지정하려면 변수 앞에 this를 붙혀야된다
		this.x = x;
	}
	
void aaa() {
	System.out.println("aaa");
	
}
//클래스 내에 정의된 변수나 메소드를 사용하는 메소드 정
void useMember() {
	int y = x; //멤버변수 사용
	System.out.println("y = " + y);
	aaa();//멤버메소드 사용
}//클래스 내에서 특정 변수나 메소드를 사용하면 자동으로 앞에 this가 붙은 것임

	public static void main(String[] args) {
//		ThisTest tt = new ThisTest();
//		tt.useMember();
		ThisTest tt = new ThisTest(100);
		//x 값을 100으로 초기화 시키면서 객체를 생성하려는 의도
		
		System.out.println("tt.x = " + tt.x);
		tt.useMember();

	}
}

