package j0525_01;

public class Card {
	
	//기본 생성자
	Card(){
		this(kinds[0],1); //SPACE, 1
	}
	
	//
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	//클래스 변수
	static String[] kinds = {"SPACE","HEART","DIAMOND","CLOVER"};
	static String[] numbers = {"0","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	String kind;
	int number;

}
