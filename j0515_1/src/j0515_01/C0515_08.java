package j0515_01;

import java.util.Scanner;

public class C0515_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 5,5배열
		String[][] box = new String[5][5];
		int random=0;
		int temp=0;
		
		//1차원 배열에 숫자넣기 -> 1~25
//		int[] num = {13,11,17,4,5,2,7,8,17,10,1,12,7,14,15,16,3,18,19,20,4,22,23,24,25};
		
		int[] num = new int[25];
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		
		
		//1차원 배열 섞기
		for(int i=0;i<100;i++) {
			random = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;					
		}
		
		
		//2차원 배열에 숫자넣기
		for(int i= 0;i<box.length;i++) {
			for(int j= 0;j<box.length;j++) {
				box[i][j] = ""+num[5*i+j];	//String타입이기 때문에 ""+int 형태로 만들어줘야한다
			}
		}
		
		
		while(true) {
		//상단 번호 출력
		System.out.print(" "+"|\t");
		for(int i=0;i<5;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		
		//화면 출력
		for(int i= 0;i<box.length;i++) {
			System.out.print(i+"|\t");
			for(int j= 0;j<box.length;j++) {
				System.out.print(box[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		
		
		//1~25까지 번호입력
		System.out.println("1~25까지 번호를 입력하시오.>>");
		int input = scan.nextInt();
		//해당 값을 찾기
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(box[i][j].equals(input+"")) {
					box[i][j] = "x";
					break;
				}
			}
		}
		
		//좌표 입력
//		System.out.println("X좌표를 입력하세요.>>(0~4)");
//		int no1 = scan.nextInt();  //ex) 1
//		System.out.println("Y좌표를 입력하세요.>>(0~4)");
//		int no2 = scan.nextInt();  //ex) 2
//		box[no1][no2] = "x";
		
		}//while
		
		

	}//main

}//class
