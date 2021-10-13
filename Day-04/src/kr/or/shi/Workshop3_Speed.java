package kr.or.shi;

public interface Workshop3_Speed {
	
	int START_SPEED = 10;
	
	public void upSpeed(int inc); //입력받은 속도가 양수인 경우
	public void downSpeed(int dec); //입력받은 속도가 음수인 경우
	public void stop();

}
