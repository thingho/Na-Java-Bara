package j0515_01;

import java.util.Scanner;

public class C0515_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 5,5배열 1~25까지 숫자입력후 출력하시오.
		//다른 방법2
		int temp=0;
		int random=0;
		String input=""; //좌표입력받음.
		String[][] box = new String[5][5];
		//String[][] arr = new String[5][5];
		int[] num = new int[25];
		//1-25까지 숫자입력
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		
		//1차원 숫자 배열 넣기
		for(int i=0;i<25;i++) {
			num[i] = i+1;
		}
		
		
		//1차원 배열 섞기
		for(int i=0;i<100;i++) {
			random = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}
		
		
		//1차원배열 값을 2차원 배열에 넣기
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				box[i][j] = ""+num[5*i+j]; //0~24
			}
		}
		
		
		//무한반복 출력
		while(true) {
			//상단 번호 출력
			for(int i=0;i<5;i++) {
				System.out.print("  \t"+i);			
			}
			
			//선 긋기
			System.out.println();
			System.out.println("------------------------------------------------------");
			
			
			//box 번호 출력
			for(int i=0;i<5;i++) {
				System.out.print(i+"|\t");
				for(int j=0;j<5;j++) {
					System.out.print(box[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println("------------------------------------------------------");
			
			
			System.out.println();
			//좌표입력
			System.out.println("좌표를 입력하세요.>>");
			input = scan.next();   //42
			
			// x표시 넣기 - char를 int형 변환
			int no1 = input.charAt(0)-'0'; //첫째자리 4 - a:97 A:65 0:48 '3'-'0'=3
			int no2 = input.charAt(1)-'0'; //둘째자리 2
			box[no1][no2] = "x";
			
			
		}//while
		
		
	}//main

}//class
