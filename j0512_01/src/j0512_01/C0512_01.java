package j0512_01;

import java.util.Scanner;

public class C0512_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1.변수 설정
		int input=0;
		int count=0; //입력된 학생수
		String[] name = new String[10];
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		
		while(true) {
			//2.화면 출력
			System.out.println("[성적처리프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생성적검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------");
			System.out.println("원하는 숫자를 입력하세요");
			input = scan.nextInt();
			
			if(input==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			//3.조건문
			switch(input) {
			case 1: //성적입력
				for(int i=count;i<name.length;i++) {
					System.out.println("이름을 입력하시오.(0.이전화면으로 이동)");
					name[i] = scan.next();
					if(name[i].equals("0")) {
						System.out.println("이전화면으로 이동합니다");
						System.out.println();
						break;
					}
					System.out.println("국어점수를 입력하시오");
					kor[i] = scan.nextInt();
					System.out.println("영어점수를 입력하시오");
					eng[i] = scan.nextInt();
					System.out.println("수학점수를 입력하시오");
					math[i] = scan.nextInt();
					//자동계산
					total[i] = kor[i]+eng[i]+math[i];
					avg[i] = total[i]/3.0;
					count++;
				}
				break;
			case 2: //화면출력
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("--------------------------------------");
				for(int i=0;i<count;i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i], kor[i], eng[i], math[i], total[i], avg[i]);
				}
				System.out.println();
				break;
			}//switch
		
		}//while
		
	}//main

}//class
