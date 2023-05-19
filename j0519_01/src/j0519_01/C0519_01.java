package j0519_01;

import java.util.Scanner;

public class C0519_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //객체 선언
		String[] name = new String[10];
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] math = new int[10];
		int[] total = new int[10];
		int choice=0;
		
		while(true) {
			//성적 입력
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생검색");
			System.out.println("0. 프로그램종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			
			switch(choice) {
			case 1:
				for(int i=0;i<10;i++) {
					System.out.println((i+1)+"번째 학생입니다.");
					for(int j=0;j<3;j++) {
						System.out.println(title[j]+"점수를 입력하세요.");
						input[j] = scan.nextInt();
					}
				}
				break;
			
			case 2:
				System.out.println();
				break;
		
			}//switch
			
		}//while
		

	}

}
