package j0517_01;

import java.util.Scanner;

public class C0517_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//인스턴스 변수 = 객체선언 : 클래스명 참조변수명 = new 참조변수명();
		C0517_02 c =new C0517_02();
		
		//1. 두 수를 입력받아 더하기 결과값을 출력하시오
//		int num1 =5;
//		int num2 =10;
//		System.out.println("[ 더하기 결과값 출력하기1 ]");
//		System.out.println("1번째 숫자를 입력하세요");
//		num1 = scan.nextInt();
//		System.out.println("2번째 숫자를 입력하세요");
//		num2 = scan.nextInt();
//		int result = c.add(num1, num2);
//		System.out.println("두 수의 더하기 : "+result);


		//두 수를 입력받아 결과값을 출력하기
		System.out.println("[ 결과값 출력하기 ]");
		int[] num = new int[2];
		for(int i=0;i<2;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			num[i] = scan.nextInt();
		}
		//메소드 호출
		int result = c.add(num[0], num[1]);
		int result2 = c.sub(num[0], num[1]);
		int result3 = c.multi(num[0], num[1]);
		int result4 = c.div(num[0], num[1]);
		System.out.println("두 수의 더하기 : "+result);
		System.out.println("두 수의 빼기 : "+result2);
		System.out.println("두 수의 곱하기 : "+result3);
		System.out.println("두 수의 나누기 : "+result4);

	}
	//1. 더하기 메소드 add
	int add(int num1,int num2) {
		int result = num1 + num2;
		return result;
	}
	//2. 빼기 메소드 sub
	int sub(int num1,int num2) {
		int result2 = num1 - num2;
		return result2;
	}
	//3. 곱하기 메소드 multi
	int multi(int num1,int num2) {
		int result3 = num1 * num2;
		return result3;
	}
	//4. 나누기 메소드 div
	int div(int num1,int num2) {
		int result4 = num1 / num2;
		return result4;
	}

}
