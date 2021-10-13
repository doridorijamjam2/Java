package kr.or.shi;

//인터페이스를 사용하는 핵심적인 이유
//자바의 단일상속을 보완해주기 위해서다.
//비행기 : 운송수단, 나는 단위....

abstract class Vehicle{
	abstract void transfer();
}

interface Flyable{
	void fly();
}

class Plane extends Vehicle implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void transfer() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
