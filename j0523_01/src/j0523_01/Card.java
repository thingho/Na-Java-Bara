package j0523_01;

public class Card {
	
	//클래스 변수 -> 객체 선언 없이 클래스명.변수명
	static String[] shape = {"Space","Heart","Diamond","Clover"};
	static String[] numbers = {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	String kind;  //무늬 4가지 - Space, Heart, Diamond, Clover
	int number;  //숫자 - 1,2,3,4,5,6,7,8,9,10,11(J),12(Q),13(K)
	
	Card(){
		this("Space",1); //다른 생성자 호출
		
		
	}
	
	Card(String kind){
		//다른 생성자 호출하려 할 때 쓰는게 this
		this.kind = kind;
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		String str = kind+","+number;
		return str;	
	}

}
