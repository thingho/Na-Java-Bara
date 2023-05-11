package j0510_01;

import java.util.Scanner;

public class C0510_05 {

	public static void main(String[] args) {
		
		// 학점 출력 : 정수를 입력받아 90 이상 A, 80이상 B, 70 이상 C, 60 이상 D, 아니면 F
		// 추가 : ?7 이상 +, ?3 이하 -, 중간은 원래대로 
		int input;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		input = scan.nextInt();
		if(input >= 90) {
			System.out.print("A");
			if(input >= 97) {
				System.out.println("+");
			}else if(input <= 83){
				System.out.println("-");
			}
		}else if(input >= 80){
			System.out.print("B");
			if(input >= 87) {
				System.out.println("+");
			}else if(input <= 83) {
				System.out.println("-");
			}
		}else if(input >= 70){
			System.out.print("C");
			if(input >= 77) {
				System.out.println("+");
			}else if(input <= 73) {
				System.out.println("-");
			}
		}else if(input >= 60){
			System.out.print("D");
			if(input >= 67) {
				System.out.println("+");
			}else if(input <= 63) {
				System.out.println("-");
			}
		}else{
			System.out.println("F");
		}
		
		
//		String input;
//		char ch;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하시오");
//		input = scan.next();  //문자열
//		ch = scan.next().charAt(0);  //문자열의 첫번째 문자
//		if(ch=='C') {
//			System.out.println("C 입니다");
//		}else {
//			System.out.println("C가 아닙니다");
//		}
		
		
//		String str;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하시오");
//		str = scan.next();
//		// 기본형 8개 이외에는 등가비교(==) 사용할 수 없어서 값이 안나온다
//		if(str.equals("C")) {
//			System.out.println("C 입니다");
//		}else {
//			System.out.println("C가 아닙니다");
//		}

	}

}
