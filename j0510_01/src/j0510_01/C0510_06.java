package j0510_01;

import java.util.Scanner;

public class C0510_06 {

	public static void main(String[] args) {
		// 1. 변수선언 num1, num2, op  2.scan입력  3.비교(switch) 4.결과값 출력 - 더하기 결과값 : 4
		char op;
		int num1;
		int num2;
		int result;
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = scan.nextInt();
		System.out.println("연산자를 입력하세요");
		op = scan.next().charAt(0);
		System.out.println("두번쨰 숫자를 입력하세요");
		num2 = scan.nextInt();
		
		switch(op) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '/':
			result = num1/num2;
			break;
		case '*':
			result = num1*num2;
			break;
		default:
			System.out.println("잘못된 입력입니다");
		}
		System.out.println();

	}

}
