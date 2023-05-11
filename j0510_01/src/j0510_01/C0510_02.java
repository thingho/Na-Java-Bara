package j0510_01;

import java.util.Scanner;

public class C0510_02 {

	public static void main(String[] args) {
		
		// 점수를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격 출력
		int input;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		input = scan.nextInt();
		if(input >= 60) {
			System.out.println("합격 입니다");
		}else if (input < 60){
			System.out.println("불합격 입니다");
		}
		
		
		

		// 문제1) 입력한 숫자가 2의 배수이면 2의 배수입니다, 2의 배수가 아닙니다, 출력
//		int input;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		input = scan.nextInt();
//		if(input%2 == 0) {
//			System.out.println("2의 배수 입니다");
//		}else {
//			System.out.println("2의 배수가 아닙니다");
//		}
//		
		
		
		// 조건문 if, else if, else
//		int num = 0;
//		if(num>0){
//			System.out.println("얌수 입니다");
//		}else if(num==0){
//			System.out.println("0입니다");
//		}else{
//			System.out.println("음수 입니다");
//		}
		
		
		
//		if, else 문
//		int num = 8;
//		if(num==8) {
//			System.out.println("8입니다");
//		}
//		else {
//			System.out.println("8이 아닙니다");
//		}
		
		
		
		

	}

}
