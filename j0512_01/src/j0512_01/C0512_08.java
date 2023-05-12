package j0512_01;

import java.util.Scanner;

public class C0512_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 국어,영어,수학,합계
		int[][] score = new int[5][3];
		String[] title = {"국어","영어","수학","합계"};
		
		for(int i=0;i<score.length;i++) {
			System.out.println((i+1)+"번째 사람 : ");
			for(int j=0;j<3;j++) {
				System.out.println(title[j]+"점수를 입력하세요");
				score[i][j] = scan.nextInt();
			}
		}
		
		//출력
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(score[i][j]+"\t");
			}
			System.out.println(title[3]+":"+(score[i][0]+score[i][1]+score[i][2]));	
		}

	}

}
