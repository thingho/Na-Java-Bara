package j0511_01;

import java.util.Scanner;

public class C0511_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//이름 붙여서 반복문 사용 -> loop로 이름 지정
		int input=0,num1=0,num2=0,sum=0;
		loop:while(true) {  //무한반복
			System.out.println("1. 더하기");
			System.out.println("2. 곱하기");
			System.out.println("0. 종료");
			System.out.println("-------------");
			System.out.println("원하는 번호를 입력하세요>>");
			input = scan.nextInt();
			if(input==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			switch(input) {
			case 1:
				while(true) {
					System.out.println("첫번쨰 숫자를 입력하시오.(0.이전페이지, 1.종료)");
					num1 = scan.nextInt();
					if(num1==0) break;
					if(num1==1) break loop;
					System.out.println("두번쨰 숫자를 입력하시오");
					num2 = scan.nextInt();
					System.out.printf("%d + %d = %d \n",num1, num2, num1+num2);
				}//두번째 while문
			} //switch문
		}//첫번째 while문
		
		
		
//		loop:for(int i=2;i<10;i++) {
//			if(i==6) break;
//			for(int j=2;j<10;j++) {
//				if(j==6) break loop;
//				System.out.printf("%d * %d = %d \n",i,j,i*j);
//				}
//				System.out.println();
//			}
		
		
		
		//구구단 짝수만 빼서 출력
//		for(int i=1;i<10;i++) {
//			if(i%2==0) {
//				continue;
//			}
//			System.out.printf("[  %d단  ]\t",i);
//		}
//		for(int i=1;i<10;i++) {
//			System.out.println();
//			for(int j=1;j<10;j++) {
//				if((i*j)%2==0) {
//					continue;
//				}
//				System.out.printf("%d * %d = %d \t",j,i,i*j);
//			}
//		}
		
		
		
//		for(int i=0;i<=10;i++) {
//			if(i%2==1) {
//				continue; //조건 실행해도 끝나지 않고 실행
//			}
//			System.out.println(i);
//		}//for문

	}

}
