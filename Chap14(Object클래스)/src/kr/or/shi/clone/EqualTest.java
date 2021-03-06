package kr.or.shi.clone;

public class EqualTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student std1 = new Student(1000,"Lee");
		Student std2 = new Student(1000,"Lee");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println("================================");
		String str1 = new String("sct");
		String str2 = new String("sct");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer integer = 100;
		System.out.println(integer.hashCode());
		//원래 hash 코드 값
		System.out.println(System.identityHashCode(integer));
		
		System.out.println("===============clone==============");
		System.out.println(std1);
		
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
		
		std1.setStudentName("Kim");
		copyStudent = (Student)std1.clone();
		
		System.out.println(std1);
		System.out.println(copyStudent);
		
	}
	

}
