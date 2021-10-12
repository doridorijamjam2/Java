package kr.or.shi;

public class CastingTest {

	public static void main(String[] args) {
		//1. 다형성을 사용하지 않은 경우의 객체 참조
		President president1 = new President();
		
		//2. 다형성을 사용하는 경우의 객체 참조
		//부모클래스 타입의 래퍼런스 변수가 자식 클래스 객체를 참조할 경우
		//자식 클래스 타입의 래퍼런스값이 부모클래스 타입으로 자동 캐스팅(Upcasting)되어 할당됨.
		Person person1 = president1;
		
		//3. 다형성을 사용하는 경우의 객체 참조
		//자식클래스 타입의 래퍼런스 변수가 부모 클래스 객체를 참조할 경우
		//컴파일 오류 발생
		//명시적으로 캐스팅(Downcasting) 해야함.
		//Downcasting 할때는 isntanceof 연산자로 캐스팅이 가능한지를 먼저 확인하고 캐스팅해야 한다.
		
		if(person1 instanceof President) {
			President president2 = (President)person1;		
		}
		else {
			System.out.println("캐스팅 불가능");
		}
		
		//캐스팅관계는 부모클래스와 자식클래스 사이에만 적용됨
		//Student student = (Student)president2;
		
		//자바에서 부모클래스 타입의 래퍼런스 변수가 자식 클래스객체를 참조하는 것은 허용하지만,
		//자식 클래스 타입의 래퍼런스 변수가 부모클래스 객체를 참조하는 것은 허용하지 않는다.
		
		Person person3 = new Person();
		
		if(person3 instanceof President) {
		President president3 = (President)person3;
		}
		else {
			System.out.println("캐스팅 불가능");
		}
		
		//다운캐스팅을 왜해야 하는지는 다음 예제에서 설명
		
		//부모클래스에 정의된 메소드를 자식 클래스에서 오버라이딩하면
		//항상 자식클래스에서 오버라이딩된 메소드가 호출된다.
		//즉, 자바에서 호출되는 메소드는 컴파일이 타임이 아니고런타임시에 결정됨.
		//즉, 자바에서 메소드 다형성이 지원됨.
		
		Person person5 = new President();
		person5.showSleepingStyle();
		person5 = new Student();
		person5.showSleepingStyle();
		person5 = new Employee1();
		person5.showSleepingStyle();
		
		//부모클래스에 정의된 메소드를 자식 클래스에서 오버라이딩하면
		//변수의 타입에 따라서 호출되는 변수가 정해진다.
		//즉, 자바에서 호출되는 변수는 컴파일이 타임에 결정됨.
		//즉, 자바에서 변수의 다형성이 지원되지 않는다.
		Person person6 = new Employee1();
		System.out.println("person6.x : " + person6.x);
		Employee1 employee1 = (Employee1)person6;
		System.out.println("employee1.x : " + employee1.x);//30
		
		//부모 클래스에는 정의가 되어있지 않고, 자식클래스에만 정의된 메소드는 부모 클래스 타입의 변수로 호출할수 없다.
		Person person7 = new Student();
		//person7.study();
		//이러한 경우에 다운캐스팅해 주어야 함.
		
		Student student2 = (Student)person7;
		student2.study();

	}

}
