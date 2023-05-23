package j0523_01;

public class C0523_01 {

	public static void main(String[] args) {
		
		//객체 선언
		Deck d = new Deck();
		//Card[] c = new Card[52];
		
		
		//d.c[0].kind;
		System.out.printf("%s, %d \n",d.c[0].kind,d.c[0].number);
		System.out.println();

		
		//출력
		for(int i=0;i<4;i++) {
			System.out.printf("%s 카드 \n",d.c[i*13].kind);
			for(int j=0;j<13;j++) {
				System.out.printf("%s, %d \n",d.c[i*13].kind,d.c[j].number);
			}
			System.out.println();
		}
		
		
//		int a=0;
//		System.out.println(a);
//		
//		
//		int[] arr = {1,2,3,4,5};
//		for(int i=0;i<5;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		int[] arr1 = new int[5];
//		arr1[0] = 1;
		
		//구구단
//		int[] gu = {2,3,4,5,6,7,8,9};
//		int[] gu2 = {2,3,4,5,6,7,8,9};
//		for(int i=0;i<8;i++) {
//			System.out.println(i+2+"단 입니다");
//			for(int j=0;j<8;j++) {
//				System.out.printf("%d * %d = %d \n",gu[i],gu2[j],gu[i]*gu[j]);
//			}
//			System.out.println();
//		}

	}

}
