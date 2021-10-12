package kr.or.shi;

public class Employee1 extends Person {
	String department;
	int x = 30;
	
	@Override
	void showSleepingStyle() {
		System.out.println("직장인들은 수면이 불규칙이다.");
	}
}
