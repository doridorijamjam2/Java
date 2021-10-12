package kr.or.shi;

public class Workshop2_MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	int preChannel;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel <= MAX_CHANNEL && channel >= MIN_CHANNEL) {
			preChannel = this.channel;
			this.channel = channel;
		}
		else
			return;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(preChannel); //이부분을 모르겟음.
	}


}
