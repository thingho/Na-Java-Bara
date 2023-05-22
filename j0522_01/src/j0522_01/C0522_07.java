package j0522_01;

public class C0522_07 {
	
	static int cv =1; //클래스 변수 -> 객체선언 x 클래스명.변수명
	int iv = 1; //인스턴스 변수 -> 객체선언 o 참조변수명.변수명
	
	static {	cv=2; 	}//클래스 초기화블럭
	
	{	iv=2; 	} //인스턴스 초기화블럭

	C0522_07(){ //생성자
		iv=3;
	}
	public static void main(String[] args) {
		
		C0522_07 c = new C0522_07();
		c.iv=3;
		
		//초기화 작업
		System.out.println();
		System.out.println("");

	}//main

}//class
