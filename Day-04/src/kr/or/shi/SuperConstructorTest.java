package kr.or.shi;

//super()
//부모 클래스의 생성자 호출

//부모 없는 자식이 없듯이
//마찬가지로 자바도 부모객체가 생성이 안되면 자식객체는 생성될수 없다.
//따라서, 자바에서 자식클래스의 생성자를 호출하면 자동으로 부모클래스의 생성자를 호출하면
//부모 클래스객체를 먼저 생성하고 자식객체가 만들어짐 1)


//호출되는 부모클래스의 생성자는 빈생성자
//따라서, 부모클래스에 인자있는 생성자만 있고 빈생성자가 없으면...오류
//자식클래스에서 명시적으로 super()를 사용해서 부모클래스의 생성자를 호출해야 한다.


class Parent extends Object{
	int x;
	public Parent(int x) {
		super();
		System.out.println("parent constructor");
	}
}

class Child extends Parent{
	public Child() {
		super(10);
		System.out.println("child cinstructor");
	}
}

public class SuperConstructorTest {

	public static void main(String[] args) {
		//1.
		Child child = new Child();

	}

}
