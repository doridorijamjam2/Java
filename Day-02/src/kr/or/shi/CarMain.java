package kr.or.shi;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.carColor = "red";
		myCar.velocity = 100;
		
		System.out.println("myCar.carName = " + myCar.carName);
		System.out.println("myCar.carColor = " + myCar.carColor);
		System.out.println("myCar.velocity = " + myCar.velocity);
		
		myCar.speedUp();
		myCar.speedUp(100);
		System.out.println("myCar.velocity = " + myCar.velocity);
		
		Car yourCar = new Car();
		System.out.println("yourCar.velocity = " + yourCar.velocity);
		
		yourCar = myCar;
		
		System.out.println("yourCar = myCar");
		System.out.println("yourCar.velocity = " + yourCar.velocity);
		

	}

}
