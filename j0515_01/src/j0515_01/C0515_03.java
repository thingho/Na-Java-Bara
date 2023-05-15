package j0515_01;

import java.util.Scanner;

public class C0515_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 10개 중 2개의 보물을 찾기 프로그램을 구성하시오

		//box배열 10개, arr배열 10개
//		int[] box = new int[10];
//		String[] arr = new String[10];
//		for(int i=0;i<10;i++) {
//			arr[i] = "?";
//		}
		int[] box = {0,0,0,0,0,0,0,0,1,2};  //번호를 맞추기 위한 배열
		String[] arr = {"?","?","?","?","?","?","?","?","?","?"};  //출력을 위한 배열
		int input=0;  //입력받은 번호변수
		int random=0;
		int temp=0;
		
		
		for(int i=0;i<10;i++) {
			if(i<8) 
				box[i] = 0;
			else if(i<9)
				box[i] = 1;
			else
				box[i] = 2;
		}
		
		//섞기 -> temp, random
		for(int i=0;i<100;i++) {
			random = (int)(Math.random()*10);
			temp = box[0];
			box[0] = box[random];
			box[random] = temp;
		}
		
		//무한반복
		while(true) {
			System.out.println("보물찾기 프로그램");
			for(int i=0;i<10;i++) {
				System.out.print(i+"\t");				
			}
			
			//arr 출력
			System.out.println();
			System.out.println("--------------------------------------------------------------------------");
			for(int i=0;i<10;i++) {
				System.out.print(arr[i]+"\t");
			}
			
			//scan입력 -> input 번호 입력
			System.out.println();
			System.out.println("번호를 입력하세요.>>");
			input = scan.nextInt();
			if(input>9) {
				continue;
			}
			
			//입련된 번호가 보물인지 비교 box배열 0,1,2
			if(box[input] == 0)
				arr[input] = "꽝";
			else if(box[input] == 1)
				arr[input] = "1억";
			else
				arr[input] = "10억";
		} //while

	}//main

}//class
