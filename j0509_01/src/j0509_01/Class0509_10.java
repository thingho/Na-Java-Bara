package j0509_01;

import java.util.Scanner;

public class Class0509_10 {

	public static void main(String[] args) {
		
		// 실수 소수점 7자리까지 입력받아 소수점 4자리까지만 출력
		// 1.변수선언 2.입력 3.출력
		double input;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요. ");
		input = scan.nextDouble();
		double result = (int)(input*10000)/10000.0;
		System.out.println(result);
		
		
		//564.124586 소수점 3자리 절사 2자리까지 존재
//		double num = 564.124586;
//		double result = (int)(num*1000)/100.0;
//		System.out.println(result);
		
		
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0;
//		System.out.println(result);

		
	}

}
