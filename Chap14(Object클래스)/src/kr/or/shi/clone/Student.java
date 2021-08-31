package kr.or.shi.clone;

public class Student implements Cloneable {
	
	private int studentNum;
	private String studentName;
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentNum == std.studentNum)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public String toString() {
	
		return studentNum + ", " + studentName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}

}
