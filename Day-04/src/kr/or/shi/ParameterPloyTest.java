package kr.or.shi;

//요구사항 추가
//만약, 인자로 전달된 객체가 Student면 study() 메소드를 호출하라~
class PersonInfo{
	public void printSleepingStyle(Person person) {
		if(person instanceof Student) {
		Student student = (Student)person;
		student.study();
		person.showSleepingStyle(); //다형성 적용
		}
	}
}

public class ParameterPloyTest {

	public static void main(String[] args) {
		PersonInfo pi = new PersonInfo();
		pi.printSleepingStyle(new Student());
		pi.printSleepingStyle(new President());
		pi.printSleepingStyle(new Employee1());

	}

}
