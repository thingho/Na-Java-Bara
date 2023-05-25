package j0525_01;

import java.util.ArrayList;

public class C0525_02_Card {

	public static void main(String[] args) {
		
		ArrayList<Card> list = new ArrayList<>();
//		list.add(new Card(Card.kinds[0],1));
//		list.add(new Card(Card.kinds[0],2));
//		list.add(new Card(Card.kinds[0],3));
		
		//퀴즈1 - 1-13		
//		for(int i=0;i<13;i++) {
//			list.add(new Card(Card.kinds[0],i+1));
//		}
		
		//퀴즈2 - 카드 4개를 만들어서, 4가지 종류를 넣으시오
//		for(int i=0;i<4;i++) {
//			list.add(new Card(Card.kinds[i],1));
//		}
		
		//퀴즈3 - 카드 52장을 만들어서, 4가지 종류로 각각 13장씩 넣으시오
		for(int i=0;i<52;i++) {
			list.add(new Card(Card.kinds[i/13],i%13+1));
		}
		
		//출력
		for(int i=0;i<52;i++) {
			System.out.println
			(list.get(i).kind+", "+list.get(i).number);
			//(list.get(i).kind+", "+Card.numbers[list.get(i).number]);
		}

	}

}
