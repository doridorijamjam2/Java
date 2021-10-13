package kr.or.shi;

import java.util.Scanner;

public class Workshop3_Car implements Workshop3_Speed, Workshop3_Display{
	
    int inputVelocity;                 //입력받을속도
   	int velocity = START_SPEED;           //현재속도
   	
    void input() {            //속도를 입력받고 disp() 
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("속도입력 : ");
    	inputVelocity = scanner.nextInt();
    	
    	disp();
	}            


    @Override
    public void disp() {
    	if(inputVelocity >= 0) {
    		upSpeed(inputVelocity);
    	}
    	else {
    		downSpeed(inputVelocity);
    	}
    	
    	if(velocity > 0) {
    		System.out.println("현재속도 " + velocity + "km/h 입니다.");
    	}
    	else {
    		stop();
    	}
    	
    }
    
    
    @Override
    public void upSpeed(int inc) {
    	velocity += inc;
    	
    }
    
    

    @Override
    public void downSpeed(int dec) {
    	velocity += dec;
    	
    }
    
    

    @Override
    public void stop() {
    	System.out.println("정지하였습니다.");
    	
    }
	



}
