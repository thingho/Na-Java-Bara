package j0516_01;

import java.util.Scanner;

public class C0516_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1.변수 설정
		int input=0;
		int count=0; //입력된 학생수
		String modifyName = "";
		String[] title = {"이름","국어", "영어", "수학", "합계", "평균"};
		String[] name = new String[10];
		//kor, eng, math, total를 한 묶음
		int [][] score = new int[10][4];
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
					//국어, 영어, 수학 -> 합계 title 이름,국어,영어,수학
					for(int j=0;j<3;j++) {
						System.out.println(title[j+1]+" 점수를 입력하세요.");
						score[i][j] = scan.nextInt();
						score[i][3] = score[i][3] + score[i][j];
					}
					//자동계산
					avg[i] = score[i][3]/3.0;
					count++;
				}
				break;
			case 2: //화면출력
				for(int i=0;i<title.length;i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("----------------------------------------------");
				
				for(int i=0;i<count;i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i], score[i][0], score[i][1], score[i][2], score[i][3], avg[i]);
				}
				System.out.println();
				break;
				
			case 3: //학생성적 수정
				System.out.println("수정할 학생 이름을 입력하세요");
				int chk = 0;
				modifyName = scan.next();
				for(int i=0;i<count;i++) {  //모든 학생을 검색
					if(name[i].equals(modifyName)) {  //모든 학생 비교
						System.out.println("[ 수정과목 선택 ]");
						System.out.println("---------------------------------");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("수정할 과목을 선택해 주세요.");
						input = scan.nextInt();
						chk = 1;  //찾을 학생이 있을 경우 1로 변경
						
						// score[i][0] = 국어, score[i][1] = 영어, score[i][2] = 수학, score[i][3] = 합계
						System.out.println(title[input]+"점수 : "+score[i][input-1]);
						System.out.println("-----------------------------------");
						System.out.println("변경할 "+title[input]+"점수를 입력하세요");
						score[i][input-1] = scan.nextInt();  //수정할 점수 입력
						score[i][3] = score[i][0] + score[i][1] +score[i][2];
						avg[i] = score[i][3]/3.0;  //평균수정
						System.out.println("[ 수정 완료 !! ]");
						System.out.println();
						break;
					}//if
				}//for
				
				//chk : 학생이름이 없는 경우
				if(chk==0) {
					System.out.println("[ 찾는 학생 없음 ]");
					System.out.println("찾는 학생이 없습니다. 다시 입력해 주세요");
					System.out.println();
				}
				break;
				
			}//switch
		
		}//while

	}//main

}//class
