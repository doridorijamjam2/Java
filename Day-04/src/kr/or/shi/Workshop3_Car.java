package kr.or.shi;

import java.util.Scanner;

public class Workshop3_Car implements Workshop3_Speed, Workshop3_Display{
	
	int result;
	int inc;
	int dec;
	


	@Override
	public void upSpeed(int inc) {
		result = Workshop3_Speed.speed + inc;
		
	}

	@Override
	public void downSpeed(int dec) {
		result = Workshop3_Speed.speed + dec;
		
	}

	@Override
	public void stop() {
		if(result < 0) {
			System.out.println("정지하셨습니다.");
		}
		
	}

	@Override
	public void disp() {
		System.out.println("현재속도는 " + result + "입니다");
		
	}
	
	public static void main(String[] args) {
		
		Workshop3_Car sp = new Workshop3_Car();
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("속도 입력 : ");
		int inputVelocity = sc.nextInt();
	
		sp.upSpeed(inputVelocity);
		sp.disp();
		
	
	
	}

}
