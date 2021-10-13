package kr.or.shi;

public class Workshop03_CarTest {

	public static void main(String[] args) {
		
		Workshop3_Car myCar = new Workshop3_Car();
		
		boolean stop = false;
		do {
			myCar.input();
			if(myCar.velocity <= 0) {
				stop = true;
			}
			
		}while(!stop);

	}

}
