package j0522_01;

import java.util.Scanner;

public class C0522_03 {
	
	//3. 매개변수 생성자
	public static void main(String[] args) {
		// 두 수를 입력받아 사칙연산하기
		// 생성자 활용
		Scanner scan = new Scanner(System.in);
		
		//배열선언
		Data[] d= new Data[2];
		int n1=0,n2=0;
		// Data 객체 사용하기 -> 객새 선언
		//Data d = new Data();
		
		for(int i=0;i<2;i++) {
			//숫자 입력
			System.out.println("1번째 숫자를 입력하세요.>>");
			n1 = scan.nextInt();
			System.out.println("2번째 숫자를 입력하세요.>>");
			n2 = scan.nextInt();
			
			//객체선언
			//d[i] = new Data();  //기본생성자 사용 x
			
			//1. 다른 생성자 사용(매개변수 있는 생성자)
			d[i] = new Data(n1,n2);
			
			//2. 그냥 모조리 다 쓰기
//			d[i] = new Data();
//			d[i].num1 = n1;
//			d[i].num2 = n2;
//			d[i].data1 = d[i].num1 + d[i].num2;
//			d[i].data2 = d[i].num1 - d[i].num2;
//			d[i].data3 = d[i].num1 * d[i].num2;
//			d[i].data4 = d[i].num1 / d[i].num2;
			

		}//for
		
		
		
		

	}//main

}//class