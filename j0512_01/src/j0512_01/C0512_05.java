package j0512_01;

import java.util.Scanner;

public class C0512_05 {

	public static void main(String[] args) {
		// 10진수를 2진수로 변경하는 프로그램
		Scanner scan = new Scanner(System.in);
//		int[] data = {0,10,20,30,40,50,60,70,80,90};
		String[] data = {"0000", "0001","0010","0011","0100","0101","0110"};
		
		int[] num = new int[5];
		int num1=0;
		int num2=0;
		int num3=0;
		
		//1.숫자입력
		for(int i=0;i<5;i++) {
			System.out.println("10진수를 입력하세요");
			num[i] = scan.nextInt();		
		}
		//2.2진코드 출력
		for(int i=0;i<5;i++) {
			System.out.print(data[num[i]]+" "); //출력						
		}

	}

}
