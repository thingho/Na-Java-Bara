package j0525_01;

import java.util.ArrayList;

public class C0525_01_Card {

	public static void main(String[] args) {
		
		//배열선언
		Card[] c = new Card[2];
		
		//객체 선언 후 생성자 사용
		Card c1 = new Card(Card.kinds[0],1);
		Card c2 = new Card(Card.kinds[1],2);
		Card c3 = new Card(Card.kinds[2],3);
		Card c4 = new Card(Card.kinds[3],4);
		
		c[0] = c1;
		c[1] = c2;

		
		//공간도 생기고 정렬이 됨
		ArrayList<Card> list = new ArrayList();
		//ArrayList 추가
		list.add(c1); //0 //Object o = new Card(Card.kinds[0],1)
		list.add(c2); //1
		list.add(c3); //2
		list.add(c4); //3
		
		//ArrayList 읽기
		//Card card = (Card)list.get(0);
		for(int i=0;i<list.size();i++) { //c.length
			System.out.println(list.get(i).kind+", "+list.get(i).number);			
		}

		
//		list.remove(2);
//		System.out.println("----------------------------------");
//		for(int i=0;i<list.size();i++) { //c.length
//			System.out.println(list.get(i).kind+", "+list.get(i).number);			
//		}
 
		//퀴즈1. kind = HEART인 것을 삭제하시오
		for(int i=0;i<list.size();i++) { //c.length
			if(list.get(i).kind.equals("HEART")) {
				list.remove(i);
			}
		}
		
		//퀴즈2. list안에 number - 4 삭제하시오
		for(int i=0;i<list.size();i++) { //c.length
			if(list.get(i).number==4) {
				list.remove(i);
			}
		}
		
		//출력
		System.out.println();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).kind+", "+list.get(i).number);			
		}
		System.out.println("개수 : "+list.size());
		System.out.println("프로그램 종료");
		
	}//main

}//class
