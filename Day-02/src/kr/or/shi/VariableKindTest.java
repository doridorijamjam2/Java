//자바의 변수 종류
//자바에서 변수는 블록으로 묶이는 곳에서는 어디서든지 선언할수 있다.
//선언되는 위치(영역"{}")에 따라서 변수 종류가 정해짐

package kr.or.shi;

public class VariableKindTest {
	int memberVar;
	//멤버변수(인스턴스 변수)
	//초기화 시점(메모리를 할당받는 시점) : 객체가 생성될때 각 객체마다 초기화됨 1.
	//멤버변수는 각 객체에 속한다는 의미
	//변수를 선언할때 값을 초기화하지 않으면 자동으로 기본값으로 초기화된다. 2.
	//클래스안의 모든 메소드에서 공유됨(사용할수 있음)
	
	static int staticVar;
	//스테이틱변수(클래스변수)
	//초기화시점 : 클래스를 로딩할 때 클래스 영역의 static area에 자동으로 초기화됨
	//해당 클래스를 사용해서 생성된 모든 객체에서 공유됨. 3.
	//또한, 객체를 생성하지않아도 클래스 이름만으로 접근 가능.
	//객체 사이에 값을 공유하는 용도로 사용됨.
	//변수를 선언할때 값을 초기화하지 않으면 자동으로 기본값으로 초기화된다.
	
	
	void paramMethod(int paramVar) {
		//파라미터 변수, 각 특징은 로컬변수와 동일
	}
	
	//메소드 종류
	//클래스 메소드
	//객체를 생성하지 않고 클래스이름으로 접근 가능
	//static 메소드는 객체를 생성하지 않고 클래스 이름으로 접근 가능
	
	public static void staticMethod1() {
		VariableKindTest vt = new VariableKindTest();
		int x = vt.memberVar;
		
		x = staticVar;
		staticMethod2();
		vt.intanceMethod1();
	}
	public static void staticMethod2() {
		
	}
	
	public void intanceMethod1() {
		int x = staticVar;
		x = memberVar;
		staticMethod1();
		intanceMethod2();
	}
	public void intanceMethod2() {
		
		
	}

	public static void main(String[] args) {
		
		//1.
		VariableKindTest vt1 = new VariableKindTest();
		VariableKindTest vt2 = new VariableKindTest();
		vt1.memberVar = 100;
		vt2.memberVar = 200;
		System.out.println("vt1.memberVar = " + vt1.memberVar);
		System.out.println("vt2.memberVar = " + vt2.memberVar);
		
		//2.
		VariableKindTest vt3 = new VariableKindTest();
		System.out.println("vt3.memberVar = " + vt3.memberVar);
		
		//3.
		VariableKindTest.staticVar = 20;
		System.out.println("VariableKindTest.staticVar = " + VariableKindTest.staticVar);
		System.out.println("vt1.memberVar = " + vt1.memberVar);
		System.out.println("vt2.memberVar = " + vt2.memberVar);
		
		int localVar;
		//로컬변수 : 메소드 안에서 선언
		//메소드가 실행될때 메모리를 확보했다가 메소드 실행이 완료되면
		//메모리를 반납
		//변수를 선언할때 값을 초기화하지 않으면
		//로컬변수는 사용하기 전에 반드시 값을 초기화 해야 한다.
		
		int x = 5;
		int y = 6;
		if(x > y) {
			localVar = 100;
		}
		else {
			localVar = 100;
		}
		
		System.out.println(localVar);
		
		//4. 
		VariableKindTest.staticMethod1();

	}

}
