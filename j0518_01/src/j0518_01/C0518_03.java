package j0518_01;

import java.util.Scanner;

public class C0518_03 {

	public static void main(String[] args) {
		// Scanner - 입력할때만 쓴다
		//import가 되지 않으면 ctrl + shift + m
		Scanner scan = new Scanner(System.in);
		
		//1. 숫자
//		int num = scan.nextInt();
//		double d = scan.nextDouble();
		//2. 문자
//		String str = scan.next();
		//nextLine() -> 엔터까지 받음
		
		//숫자 2개를 입력받아 1, 10
		int sum=0;
		int temp=0;
		System.out.println("첫번째 숫자 입력.>>");
		int a= scan.nextInt();
		System.out.println("두번째 숫자 입력.>>");
		int b= scan.nextInt();
//		if(b<a){
//			for(int i=b;i<=a;i++) {
//				sum += i;
//			}
//		}
		if(b<a) {
			temp = a;
			a = b;
			b = temp;
		}		
		for(int i=a;i<=b;i++) {
			sum += i;
		}			
		System.out.println(sum);
		

	}//main

}//class
