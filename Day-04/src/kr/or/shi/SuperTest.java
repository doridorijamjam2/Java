package kr.or.shi;

//super
//부모클래스 객체를 참조하는 래퍼런스 변수
//자식클래스 객체에서 은폐된 부모 멤버에 접근할 때 사용

class Employee{
	String name = "이호창";
	int salary = 1000;
	
	//사원의 정보를 반환하는 메소드 정의
	String getInfo() {
		return "이름 : " + name + ", 급여 : " + salary;
	}
}

class Salasman extends Employee{
	int commission;
	
	@Override
	String getInfo() {
		// TODO Auto-generated method stub
//		return "이름 : " + name + ", 급여 : " + salary + ", 수당 : " + commission;
		
		return super.getInfo() + ", 수당 : " + commission;
	}
}
public class SuperTest {

	public static void main(String[] args) {
		Salasman sa = new Salasman();
		sa.getInfo();

	}

}
