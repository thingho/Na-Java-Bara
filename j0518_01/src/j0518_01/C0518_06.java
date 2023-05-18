package j0518_01;

import java.util.Scanner;

public class C0518_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 국어, 영어, 수학 점수를 입력받아 평균에 따라 학점을 출력하시오
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

		
		if(avg>=90) {
			if(avg>=97) {
				System.out.printf("평균은 %.2f로 A+입니다",avg);
			}else if(avg<=93){
				System.out.printf("평균은 %.2f로 A-입니다",avg);
			}else {
				System.out.printf("평균은 %.2f로 A입니다",avg);				
			}
		}else if(avg>=80) {
			if(avg>=87) {
				System.out.printf("평균은 %.2f로 B+입니다",avg);
			}else if(avg<=83){
				System.out.printf("평균은 %.2f로 B-입니다",avg);
			}else {
				System.out.printf("평균은 %.2f로 B입니다",avg);				
			}
		}else if(avg>=70) {
			if(avg>=77) {
				System.out.printf("평균은 %.2f로 C+입니다",avg);
			}else if(avg<=73){
				System.out.printf("평균은 %.2f로 C-입니다",avg);
			}else {				
				System.out.printf("평균은 %.2f로 C입니다",avg);
			}
		}else if(avg>=60) {
			if(avg>=67) {
				System.out.printf("평균은 %.2f로 D+입니다",avg);
			}else if(avg<=63){
				System.out.printf("평균은 %.2f로 D-입니다",avg);
			}else {				
				System.out.printf("평균은 %.2f로 D입니다",avg);
			}
		}else {
			System.out.printf("평균은 %.2f로 F입니다",avg);
		}
		

	}//main

}//class
