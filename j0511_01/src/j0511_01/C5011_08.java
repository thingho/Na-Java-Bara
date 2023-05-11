package j0511_01;

public class C5011_08 {

	public static void main(String[] args) {
		
		//10개의 배열을 만들고 랜덤숫자 1~10까지 숫자를 입력해서 출력하시오
		int[] num = new int[10];
		int random = 1;
		for(int i=0;i<10;i++) {
			random =(int)(Math.random()*10)+1;
			num[i] = random;
			System.out.println(num[i]);
		}
		
		
		//배열 100개 만들고 1~100까지의 있는 숫자를 입력하시오
//		int[] num = new int[100];
//		for(int i=0;i<100;i++) {
//			num[i] = i+1;
//			System.out.println(num[i]);
//		}
		
		
		// int 배열
//		int[] num = new int[2];
//		num[0] = 1;
//		num[1] = 2;
//		
//		for(int i=0;i<num.length;i++) {  //0~1까지
//			System.out.println(num[i]);
//		}

	}

}
