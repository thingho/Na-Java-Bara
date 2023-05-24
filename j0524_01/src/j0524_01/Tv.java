package j0524_01;

public class Tv {
	boolean power;
	int channel;
	
	//전원
	void power() {
		power = !power;
	}
	
	//채널 조정
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}

}
