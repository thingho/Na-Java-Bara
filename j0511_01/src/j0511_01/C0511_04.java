package j0511_01;

public class C0511_04 {

	public static void main(String[] args) {
		
		
		int i=0,sum=0;
		for(i=0;;i++) {
			if(sum>5) {
				break;
			}
			sum += i;
		}
		System.out.println("i의 결과값 : "+i);
		System.out.println("sum의 결과값 : "+sum);

		
		
		
//		int i=0, sum=0;
//		while(true) {
//			if(sum>100) {
//				break;  //while, for문을 종료할 때 break문을 사용
//			}
//			i++;      //14 105
//			sum += i; // 13 91
//		}
//		System.out.println("i의 결과값 : "+i);
//		System.out.println("sum의 결과값 : "+sum);
	}

}
