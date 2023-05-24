package j0524_01;

public class Singleton {
	
	private static int num;
	
	//같은 클래스 내에서만 s를 사용할 수 있음
	private static Singleton s = new Singleton();
	
	//생성자 생성
	private Singleton(){
		num = 10;
	}
	
	
	//getInstance 메소드 생성 -> return타입 : Singleton클래스
	static Singleton getInstance() {
		if(s==null) { //s가 null이라면
			s = new Singleton(); //객체를 다시 선언
		}
		return s;
	}

	//num
	public static int getNum() {
		return num;
	}
	public static void setNum(int num) {
		Singleton.num = num;
	}
	
	

}
