package kr.or.shi.equals;

import java.util.Arrays;

public class Student {
	int age;
	String name;
	int[] subject;
	
	public Student(int age, String name, int[] subject) {
		this.age = age;
		this.name = name;
		this.subject = subject;
		
		
		
		}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student student = (Student)obj;    //Downcasting
			//논리적 동등을 위한 조건 설정
			if((this.age == student.age) && (this.name == student.name) && (Arrays.equals(this.subject, student.subject))) {
				return true;
			}
		
		}	
		return false;
	}

}
