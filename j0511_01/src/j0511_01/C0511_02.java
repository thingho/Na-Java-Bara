package j0511_01;

import java.util.Scanner;
public class C0511_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//조건식이 없으면 무한반복
		for(;;) {
			System.out.println("프로그램을 실행합니다! 숫자를 입력해주세요> ");
			int num = scan.nextInt();
			if(num == 0) {
				System.out.println("종료합니다");
				break;
		}
		
		
		
//		while(true) {
//			System.out.println("숫자를 입력하세요");
//			int num = scan.nextInt();
//			if(num == 0) {
//				System.out.println("종료");
//				break; //반복문 종료 = break
//			}
		}
		
		
		//		int i = 10;
//		do{
//			System.out.println("i의 값 : "+i);
//		}while(i<0);
//		System.out.println("프로그램을 종료합니다.");
	}

}
