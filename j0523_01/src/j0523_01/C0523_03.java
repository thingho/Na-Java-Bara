package j0523_01;

//패키지는 첫글자가 소문자, 클래스는 첫글자가 대문자
import java.util.Date;
import java.util.Scanner;

public class C0523_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Date today = new Date();
		final int NUMBER=5;
		
		//객체 선언
		Card c = new Card("Space",1);
		System.out.println(c);
		
		Card c2 = null;
		Deck d = new Deck();
		//c2 = d; //서로 타입이 다르기 떄문에 넣을 수 없다
		c2 = c; //같은 타입이라 넣을 수 있음 
		
		Object o = null;
		o = d;
		//조상과 자손이라는 관계가 맺어져서 가능
		
		int a = 5;
		String str = null;
		//str = a; //서로 타입이 다르기 떄문에 넣을 수 없다
		
		int num = 5;
		num = 10; 
		//NUMBER=5; //상수는 대문자로 쓰기
		

	}//main
	
	static void add() {
		
	}
	
	static void add(int x) { //오버로딩 : 다른메소드가 됨
		
	}

}
