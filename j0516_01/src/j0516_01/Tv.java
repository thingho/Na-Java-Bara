package j0516_01;

//클래스에는 앞에 대문자
public class Tv {
	//메소드 내의 지역변수에 기본값을 넣지 않으면 에러가 난다
	//클래스(class) 내의 변수는 자동으로 기본값을 넣어준다
	
	String color;
	boolean power;
	int channel;
	int volume;
	
	//객체는 뒤에 소괄호
	void power() {
		power =! power;
	}
	
	//channel
	void channelUp() {
		if(channel>=999) {
			channel=1;
			return;
		}
		channel++;
	}
	void channelDown() {
		if(channel<=1){
			channel=999;
			return;
		}
		channel--;
	}
	
	//volume
	void volumeUp() {
		if(volume>=30) {
			volume=30;
			System.out.println("볼륨이 30 이상으로 올라가지 않습니다");
			return;
		}
		volume++;
	}
	void volumeDown() {
		if(volume<=0) {
			volume=0;
			System.out.println("볼륨이 0 이하로 내려가지 않습니다");
			return;
		}
		volume--;
	}

}
