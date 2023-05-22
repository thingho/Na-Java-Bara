package j0522_01;

import java.util.Scanner;

public class C0522_01 {

	public static void main(String[] args) {
		// 두 수를 입력받아 사칙연산하기
		// 생성자 활용
		Scanner scan = new Scanner(System.in);
		
		//배열 선언 해주기
		int[] num = new int[4];
		int[] data = new int[8];
		
		for(int i=0;i<2;i++) {
			for(int j=(i*2)+0;j<(2*i)+2;j++) {  //(2*0)+0=0, (2*0)+1=1, (2*1)+0=2, (2*1)+1=3  
				System.out.println((j+1)+"번째 숫자를 입력하세요.>>");
				num[j] = scan.nextInt();
			}
			
			//사칙연산 값 출력
			data[i*4] = num[i*2] + num[(i*2)+1];  //4*0, 4*1 -> 4*i
			System.out.println(data[i*4]);
			data[(i*4)+1] = num[i*2] - num[(i*2)+1];
			System.out.println(data[(i*4)+1]);
			data[(i*4)+2] = num[i*2] * num[(i*2)+1];
			System.out.println(data[(i*4)+2]);
			data[(i*4)+3] = num[i*2] / num[(i*2)+1];
			System.out.println(data[(i*4)+3]);
			System.out.println();
		}
		
		
//		for(int i=2;i<4;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.>>");
//			num[i] = scan.nextInt();
//		}
//		
//		//사칙연산 값 출력2
//		data[4] = num[2] + num[3];
//		System.out.println(data[4]);
//		data[5] = num[2] - num[3];
//		System.out.println(data[5]);
//		data[6] = num[2] * num[3];
//		System.out.println(data[6]);
//		data[7] = num[2] / num[3];
//		System.out.println(data[7]);
//		System.out.println();
		
		
		
		

	}//main

}//class
