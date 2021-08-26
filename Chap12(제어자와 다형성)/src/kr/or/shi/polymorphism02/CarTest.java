package kr.or.shi.polymorphism02;

public class CarTest {

	public static void main(String[] args) {
		Car car = null;
		SportCar sportCar = new SportCar();
		PoliceCar policecar = new PoliceCar();
		
		sportCar.speedUp();
		
		car = sportCar;   //업캐스팅 (자손->조상) : 조작할수 있는 멤버가 줄어듬.
		//car.speedUp();
		
		SportCar sportCar2 = null;
		sportCar2 = (SportCar)car;    // 2. 다운캐스팅 (조상->자손) : 조작할수 있는 멤버가 늘어남.
		                              // 다운캐스팅을 할때, 반드시 명시적으로 형변환 코드르 작성해야함.
		
		sportCar2.speedUp();
		
		// sportCar = policeCar; //서로 관련 없는 클래스들간의 형변환 : 서로 상속관계가 아니기 때문에 형변환이 이루어질수 없다.

	}

}
