package j0510_01;
import java.util.Scanner;

public class C0510_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//랜덤숫자 1~100까지의 랜덤 숫자 1개를 출력하시오
		int random;
		random = (int)(Math.random()*100)+1;
		
		//숫자 맞추기 프로그램 - 10번
		int i=1;
		while(i<=10) {
			System.out.println(i+"번쨰 숫자를 입력하세요");
		    int input = scan.nextInt();
		    if(input == random) {
		    	System.out.println("정답");
		    	break;
		    }else if(input>random){
		    	System.out.println("[ 오답 ] 입력한 숫자보다 작습니다");
		    }else{
		    	System.out.println("[ 오답 ] 입력한 숫자보다 큽니다");
		    }
		    i++;
		}
		
		
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}
//		//초기화
//		int i=0;
//		while(i<10) {
//			System.out.println(i);
//		}
		
		
		//i 내림차순으로 출력하기
//		for(int i=100;i>0;i=i--) {
//			System.out.println(i);
//		}
		
		
		//00 01 02 03 04.....09 10 11.....99까지 찍기
		// 중첩 for문을 사용해서 출력
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				System.out.printf("%d%d ",i,j);
//			}
//			System.out.println();
//		}
		
		
		//0부터 9까지 출력하시오
//		for(int i=0;i<=9;i++) {
//			System.out.println(i);
//		}
		
		
		//구구단 출력하기
//		for(int i=1;i<=9;i++) {
//			System.out.printf("[  %d단  ] \n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \n",i,j,i*j);
//			}
//			System.out.println();
//		}

	}

}
