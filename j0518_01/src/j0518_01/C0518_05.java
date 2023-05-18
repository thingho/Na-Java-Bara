package j0518_01;

import java.util.Scanner;

public class C0518_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 숫자를 입력받아, 양수인지 음수인지 출력하시오 0은 양수로 인정
//		System.out.println("숫자를 입력하세요.>>");
//		int a = scan.nextInt();
//		if(a>=0) {
//			System.out.println("양수입니다");
//		}else {
//			System.out.println("음수입니다");
//		}
		
		//국어, 영어, 수학 점수를 입력받아 평균 60 넘으면 합격, 불합격을 출력하시오
		String[] title = {"국어","영어","수학"};
		int[] score = new int[3];
		int total=0;
		double avg=0;
		
		for(int i=0;i<3;i++) {
			System.out.println(title[i]+"점수를 입력하세요.>>");
			score[i] = scan.nextInt();
			total += score[i];
		}
		avg = total/3.0;

		
		if(avg>=60) {			
			System.out.printf("평균은 %.2f로 합격입니다",avg);
		}else {
			System.out.printf("평균은 %.2f로 불합격입니다",avg);
		}
		
		

	}

}
