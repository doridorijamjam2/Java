package kr.or.shi;

//this()
//동일 클래스의 다른 생성자 호출
//여러 생성자에서 반복해서 처리하는 중복코드를 특정생성자에 정의하고 
//다른 생성자들은 해당 기능을 기능이 구현된 생성자를 호출해서 처리함므로써
//중복코드를 제거하는 용도

//음료수 클래스를 정의하라
//속성은 name 과 price를 정의한다.
//이름이 정의되지 않으면 이름은 "물"로 하고, 가격이 정의되지 않으면 1000원으로 한다.
//this() 사용규칙
//1. 생성자의 철번째 실행문이어야 함
//2. recursive 호출 안됨
class Drink{
	String name;
	int price;
	
	//생성자 오버로딩
	public Drink() {
	this("물", 1000);
	}
	
	public Drink(String name) {
		this(name, 1000);
	}
	
	public Drink(int price) {
		this("물", price);
	}
	
	public Drink(String name,int price) {
		//this(name, price);
		this.name = name;
		this.price  = price;
	}
	
}

public class ThisConstructor {

	public static void main(String[] args) {
		

	}

}
