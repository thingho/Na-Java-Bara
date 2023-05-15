package j0515_01;

import java.util.Scanner;

public class C0515_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 배열 - 45개
		int[] arr = new int[45];
		int random=0;
		int temp=0;
		int count=0; 
		int[] myNum = new int[6];  //입력한 번호
		int[] lottoNum = new int[6];  //로또번호 맞춘 번호
		
		//1~10
		for(int i=0;i<45;i++) {
			arr[i] = i+1;
			}
		
		//섞기
		for(int i=0;i<1000;i++) {
			random = (int)(Math.random()*45);  //0~44
			temp = arr[0];
			arr[0] = arr[random];
			arr[random] = temp;
		}
		
		//번호입력 - 6개
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 번호를 입력");
			myNum[i] = scan.nextInt();
			}
		
		//맞춘 개수
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(arr[i] == myNum[j]) {
					lottoNum[count] = arr[i]; 
					count++;
					continue;
				}
			}
		}
		
		//로또번호 출력
		System.out.print("로또번호 출력 : ");
		for(int i=0;i<6;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//입력번호 출력
		System.out.print("입력번호 출력 : ");
		for(int i=0;i<6;i++) {
			System.out.print(myNum[i]+" ");
		}
		System.out.println();
		
		//로또 맞춘 번호
		System.out.print("맞춘번호 출력 : ");
		for(int i=0;i<count;i++) {
			System.out.print(lottoNum[i]+" ");
		}
		System.out.println();
		
		System.out.println("맞춘 개수 : "+count);

	}

}
