package kr.or.shi;

//클래스 : 객체를 설계해 놓은 단위
//집
//설게도 : 클래스
//실질적으로 만들어진 집 : 객체
public class Car {
	
	String carName;
	String carColor;
	String company;
	int velocity;
	
	//메소드
	//리턴타입 메소드명(파라미터 변수, ...){
	//메소드 기능정의;
	//}
	//메소드의 리턴값이 없을때는 리턴타입을 void로 지정함
	
	void run() {
		System.out.println("달린다.");
	}
	void stop() {
		System.out.println("멈춘다.");
	}
	
	//메소드 오버로딩
	void speedUp() {
		velocity += 1;
	}
	void speedUp(int speed) {
		velocity += speed;
	}
	
	void speedDown() {
		velocity -= 1;
	}
	void speedDown(int speed) {
		velocity -= speed;
	}
}
