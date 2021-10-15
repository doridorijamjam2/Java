package kr.or.shi;

class Student{
	int schoolType;
	
	public final static int ELEMENTARY = 1;
	public final static int MIDDLE = 2;
	public final static int HIGH = 3;
	public final static int UNIVERSITY = 4;
	
	public Student(int schoolType) {
		this.schoolType = schoolType;
	}
	
}

public class EnumTest {
	
	public static void main(String[] args) {
		
		Student student1 = new Student(Student.ELEMENTARY);
		Student student2 = new Student(1);
		
		if(student1.schoolType == Student.ELEMENTARY) {
			
		}
		if(student2.schoolType == 1) {
			
		}
		
		System.out.println(student1.schoolType);

	}

}
