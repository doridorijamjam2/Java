package kr.or.shi;

public class Student extends Person {
	
	String schoolKind;
	int grade;
	
	@Override
	void showSleepingStyle() {
		System.out.println("학생들의 수면스타일은 규칙적이다.");
	}
	
	//부모클래스에 정의되지 않은 메소드
	void study() {
		System.out.println("공부를 한다.");
	}



}
