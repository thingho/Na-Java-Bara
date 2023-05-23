package j0523_01;

public class Time {
	private int hour; //인스턴스 변수 -> 객체 선언 후 참조변수명.변수명
	private int minute;
	private int second;
	
	Time(){} //기본생성자
	
	Time(int hour, int minute, int second){ //매개변수가 있는 생성자
		this.hour = hour; //this -> 인스턴스변수 가리킴
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() { //hour의 변수값을 읽어오는 메소드
		return hour;
	}
	
	public void setHour(int hour) { //hour의 변수값을 저장하는 메소드
		if(hour<0||hour>23) {
			System.out.println("데이터가 잘못 입력되었습니다.");
			return;
		}
		this.hour = hour;
	}

}
