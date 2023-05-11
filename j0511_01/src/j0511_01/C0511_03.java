package j0511_01;
import java.util.Scanner;

public class C0511_03 {

	public static void main(String[] args) {
		//사칙연선 프로그램 만들기
		Scanner scan = new Scanner(System.in);
		int input;
		int num1;
		int num2;
		int num3;
		
		while(true) {
			System.out.println("[ 사칙연산 프로그램 ]");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 더하기");
			System.out.println("0. 종료");
			System.out.println("원하는 번호를 선택하세요.>>");
			input = scan.nextInt();  //원하는 번호 입력받음
			
			//다른 조건 생성
			if(input==0) {
				System.out.println("종료합니다");
				break;
			}
			
			//숫자를 입력받음 -> switch문에서 빼서 코드를 줄임
			System.out.println("첫번째 숫자를 입력하세요");
			num1 = scan.nextInt();
			System.out.println("두번째 숫자를 입력하세요");
			num2 = scan.nextInt();
			
			//조건문 생성(switch문)
			switch(input) {
			case 1:
				System.out.println("더하기 결과값 : "+(num1+num2));
				break;
			case 2:
				System.out.println("빼기 결과값 : "+(num1-num2));
				break;
			case 3:
				System.out.println("곱하기 결과값 : "+(num1*num2));
				break;
			case 4:
				System.out.println("나누기 결과값 : "+(num1/num2));
				break;
			}// switch문
		}// while문

	}

}
