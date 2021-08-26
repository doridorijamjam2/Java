package kr.or.shi.object03;

public class Monitor {
	
	//멤버변수(필드)
	String color;    //모니터 색상
	int channel;     //채널
	int volume;      //볼륨
	boolean power;   //전원(on/off)
	
	
	//멤버 메서드
	//Monitor를 켜거나 끄는 기능을 하는 메서드
	public void power() {
		if(!this.power) {
			System.out.println("모니터 on");
			this.power = !power;
		}
		else {
			System.out.println("모니터 off");
			this.power = !power;
		}
	}
	public void channelUp() {
		this.channel++;
		System.out.println("현재 채녈 : " + this.channel);
	}
	public void channelDown() {
		this.channel--;
		System.out.println("현재 채녈 : " + this.channel);
	
}
	public void volumeUp() {
		System.out.println("현재 볼륨 : " + (++this.volume));
	}
	public void volumeDown() {
		System.out.println("현재 볼륨 : " + (--this.volume));
		
	}
	@Override
	public String toString() {
		
		return "현재 채널 : " + channel + ", 현재 볼륨 : " + volume ;
	}
}
