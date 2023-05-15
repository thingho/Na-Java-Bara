package j0515_01;

import java.util.Scanner;

public class C0515_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 5,5배열을 만들어서 해당번호를 X표시하는 프로그램을 구현하시오
		String[][] box = new String[5][5];
		int random=0;
		int temp=0;
		int input =0; 
		
		
		//1차원 배열
		int[] num = new int[25];
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
		
		//2차원 배열 넣기
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				box[i][j] = ""+num[5*i+j];
			}
		}
		
		//무한 반복
		while(true) {
		//상단 표시
		System.out.print("  \t");
		for(int i=0;i<5;i++) {
			System.out.print(i+" \t");
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		
		//출력
		for(int i=0;i<5;i++) {
			System.out.print(i+"|\t");
			for(int j=0;j<5;j++) {
				System.out.print(box[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		System.out.println();
		
		//숫자 입력
		System.out.println("숫자를 입력하세요.>>");
		input = scan.nextInt();
		loop:for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(box[i][j].equals(""+input)) {
					box[i][j] = "x";
					break loop; //break를 사용해야 함
				}
			}
		}
		
		
		}//while

	}//main

}//class
