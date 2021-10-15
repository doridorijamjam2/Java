package kr.or.shi;

class Student1{
	SchoolType schoolType;
	
	public Student1(SchoolType schoolType) {
		this.schoolType = schoolType;
	}
}
enum SchoolType{
	ELEMENTARY, MIDDLE, HIGH, UNIVERSITY
}

public class EnumTest2 {

	public static void main(String[] args) {
		
		Student1 student1 = new Student1(SchoolType.ELEMENTARY);
		System.out.println(student1.schoolType);

	}

}
