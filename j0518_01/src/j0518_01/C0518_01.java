package j0518_01;

import java.util.Scanner;

public class C0518_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		int sum1=0;
		int sum2=0;
		int multi=1;
		
		//1~10까지 합
		for(int i=1;i<=10;i++) {
			//sum = sum + i;
			sum += i;
		}
		System.out.println(sum);
		
		//1~100까지 합
		for(int i=1;i<=100;i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		//1~1000까지 합
		for(int i=1;i<=1000;i++) {
			sum2 += i;
		}
		System.out.println(sum2);
		System.out.println();
		
		//5 팩토리얼 -> 5! = 5*4*3*2*1
		System.out.println("숫자를 입력하세요.>>");
		int input = scan.nextInt();
		for(int i=input;i>1;i--) {
			multi *= i;
		}
		System.out.println(input+" 팩토리얼 계산값 : "+multi);

	}//main

}//class
