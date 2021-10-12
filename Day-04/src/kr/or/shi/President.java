package kr.or.shi;

public class President extends Person {
	
	String nation;
	int salary;
	
	@Override
	void showSleepingStyle() {
		System.out.println("대통령은 항상 과중한 업무로 수면 시간이 부족하다.");
	}

}
