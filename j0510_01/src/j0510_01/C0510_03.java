package j0510_01;

import java.util.Scanner;

public class C0510_03 {

	public static void main(String[] args) {
		
		// 1) m, f를 문자로 입력받아 m이면 남자입니다, f이면 여자입니다. 출력하시오
		// 1. 변수선언  2.scan한 후 변수 입력  3. 비교  4. 출력
		char input;
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하시오");
		input = scan.next().charAt(0);
		if(input == 'm' || input == 'M') {
			System.out.println("남자입니다");
		}else if(input == 'f' || input == 'F'){
			System.out.println("여자입니다");
		}
		
		// 2) String으로 사용
		String input1;  //객체, 기본형타입만 ==
		System.out.println("문자를 입력하시오");
		input1 = scan.next();
		if(input1.equals("m") || input1.equals("M")) {
			System.out.println("남자입니다");
		}else if(input1.equals("f") || input1.equals("F")){
			System.out.println("여자입니다");
		}
		

		//입력한 숫자가 1,6,9만 입력받아 출력하시오.
//		int input;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오");
//		input = scan.nextInt();
//		if(input == 1) {
//			System.out.println("입력된 숫자는 1");
//		}else if(input == 6){
//			System.out.println("입력된 숫자는 6");
//		}else {
//			System.out.println("입력된 숫자는 9");
//		}
		
		
		
		// 점수를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격 출력
//		int input;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하시오");
//		input = scan.nextInt();
//		if(input >= 60) {
//			System.out.println("합격 입니다");
//		}else{
//			System.out.println("불합격 입니다");
//		}//if

	}//main

} //class
