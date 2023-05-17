package j0517_01;

import java.util.Scanner;

public class C0517_03 {

	public static void main(String[] args) {
		//3개의 숫자를 입력받아 합계를 구하시오
		//add 메소드를 사용하시오
		Scanner scan = new Scanner(System.in);
		
		//객체선언 -> 클래스명 참조변수명 = new 클래스명
		C0517_03 c0517_03 = new C0517_03();
				
		int[] num = new int[3];
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요");
			num[i] = scan.nextInt();			
		}
		
		//메소드 호출
		int result = c0517_03.add(num[0], num[1], num[2]);
		System.out.println("세 수의 합 : "+result);
		

	}
	
	int add(int num1, int num2, int num3) {
		int result = num1+num2+num3;
		return result;
	}

}
