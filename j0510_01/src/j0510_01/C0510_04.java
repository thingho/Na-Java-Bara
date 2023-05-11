package j0510_01;

import java.util.Scanner;

public class C0510_04 {

	public static void main(String[] args) {
		
		//m, f 입력받아 m 남자, f 여자라고 출력하기
		char input;
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		input = scan.next().charAt(0);
		switch(input) {
		case 'm':
		case 'M':
			System.out.println("남자입니다");
			break;
		case 'f':
		case 'F':
			System.out.println("여자입니다");
			break;
		default:
			System.out.println("잘못된 입력입니다");
		}
		
		
		
		//switch()문 사용
//		int input;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		input = scan.nextInt();
//		switch(input) {
//		case 1:
//			System.out.println("1 입니다.");
//			break;
//		case 6:
//			System.out.println("6 입니다.");
//			break;
//		case 9:
//			System.out.println("9 입니다.");
//			break;
//		default:
//			System.out.println("원하는 숫자가 압니다.");
//		} //switch
		
	}

}
