package j0509_01;

import java.util.Scanner;

public class Class0509_11 {

	public static void main(String[] args) {
		
		//실수를 입력받아 소수점 4자리에서 올림해서 출력하시오
		double input;
		Scanner scan = new Scanner(System.in);
		System.out.println("실수를 입력하세요. ");
		input = scan.nextDouble();
		//반올림 round(), 올림 ceil(), 버림 floor()
		double result4 = Math.round(input*1000)/1000.0;
		System.out.println(result4);
		
		
		//소수점 5자리를 입력받아 3자리에서 반올림해서 출력하시오.
//		double input;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("실수를 입력하세요. ");
//		input = scan.nextDouble();
//		//반올림 round(), 올림 ceil(), 버림 floor()
//		double result3 = Math.round(input*100)/100.0;
//		System.out.println(result3);
		
		//double pi = 3.7894; 소수점 2자리에서 반올림해서 출력하시오
//		double num = 3.7894;
//		double result2 = Math.round(num*10)/10.0;
//		System.out.println(result2);
		
		//소수점 4자리에서 반올림 출력하시오
		//1.변수선언 2.출력
//		double pi = 3.141592;
//		double result = Math.round(pi*1000)/1000.0;
//		System.out.println(result);

	}

}
