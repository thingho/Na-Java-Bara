package j0523_01;

public class C0523_02 {

	public static void main(String[] args) {
		
		//객체 선언
		Deck d = new Deck();
		//카드 섞기
		d.shuffle();

		//카드 뽑기 메소드 = d.pick(번호)
		System.out.println(d.pick(51).kind);
		System.out.printf("%s, %d \n",d.pick(51).kind,d.pick(51).number);
		
		//출력
		for(int i=0;i<52;i++) {
			System.out.printf("%s , %d \n",d.c[i].kind,d.c[i].number);
		}
		//
		for(int i=0;i<52;i++) {
			System.out.printf("%s , %s \n",d.c[i].kind,Card.numbers[d.c[i].number]);
		}
		//
		for(;;) {
			
		}
		
		//출력
//		for(int i=0;i<52;i++) {
//			System.out.printf("%s , %d \n",d.c[i].kind, d.c[i].number);			
//		}

	}

}
