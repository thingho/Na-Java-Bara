package j0523_01;

public class Deck {
	
	//4종류 * 13 = 52장 카드 생성 -> 배열 선언
	Card[] c = new Card[52];
	
	//기본생성자 생성
	//kind = null, number=0으로 들어가짐
	//space 1-13, heart 14-26, diamond 27-39, clover 40-52
	Deck() {
		for(int i=0;i<52;i++) {
			c[i] = new Card(); //객체 선언 -> 공간 생성
			c[i].kind = c[i].shape[i/13]; //(13*(i/13))+i%13
			c[i].number = (i%13)+1; //1,2,3,4,5,6,7,8,9,10,11,12,13,1......
		}
	}//Deck
	
	//카드뽑기 -> c[0],c[1],c[3]......
	Card pick(int index) { //0-51
		return c[index];
	}
	
	//섞기
	void shuffle() {
		for(int i=0;i<1000;i++) {
			int random = (int)(Math.random()*51);
			Card temp = null; //초기화 -> 객체에 대한 변수
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;			
		}//for
	}//shuffle

}//class
