package j0515_01;

import java.util.Scanner;

public class C0515_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 보물찾기 게임
		
		// 상재 10개
		//int[] box = {0,0,0,0,0,0,0,1,1,1};
		int[] box = new int[10];
		int random = 0;
		int temp = 0;
		String[] arr = new String[10];
		int input=0;
		
		for(int i=0;i<10;i++) {
			arr[i] = "?";
		}
		
		
		for(int i=0;i<10;i++) {
			if(i<7) {
				box[i] = 0;
			}else {
				box[i] = 1;
			}
		}
		
		
		//섞기
		for(int i=0;i<100;i++) {
			random = (int)(Math.random()*10);
			temp = box[0];
			box[0] = box[random];
			box[random] = temp;
		}
		
		while(true) {
			//화면출력
			System.out.println("[ 보물찾기 프로그램 ]");
			for(int i=0;i<10;i++) {
				System.out.print(i+"\t");
			}
			//번호출력
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------");
			for(int i=0;i<10;i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
			
			
			//번호입력
			System.out.println();
			System.out.println("번호를 입력해주세요.>>");
			input = scan.nextInt();
			//보물인지 아닌지 비교
			if(box[input]==1)
				arr[input] = "보물";
			else
				arr[input] = "꽝";	
		} //while문
		
	} //main

} //class
