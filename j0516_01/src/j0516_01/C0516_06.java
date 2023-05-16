package j0516_01;

import java.util.Scanner;

public class C0516_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice=0; //선택번호
		int count=0; //성적입력 학생수
		int check=0; //존재유무
		String searchName ="";
		String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
		
		Student[] s = new Student[10]; //Student 참조변수배열 10개 생성
		
		while(true) {
			System.out.println("[성적처리프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 등수처리");
			System.out.println("5. 학생검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------");
			System.out.println("원하는 숫자를 입력하세요");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				for(int i=count;i<s.length;i++) {
					s[0] = new Student(); //객체선언

					//이름입력부분
					System.out.println(count+1+" 번쨰 학생의 이름을 입력하세요.(0.이전페이지 이동)>>");
					s[i].name = scan.next();
					
					//이전페이지 이동확인
					if(s[i].name.equals("0")) {
						System.out.println("이전페이지로 이동합니다.");
						System.out.println();
						break;
					}
					
					//국어, 영어, 수학 점수 입력
					System.out.println("국어점수를 입력하시오");
					s[i].kor=scan.nextInt();
					System.out.println("영어점수를 입력하시오");
					s[i].eng=scan.nextInt();
					System.out.println("수학점수를 입력하시오");
					s[i].math=scan.nextInt();
					
					//합계부분
					s[i].sum();
					//평균부분
					s[i].average();
					
					System.out.println((count+1)+"번째 학생성적이 등록되었습니다");
					System.out.println();
					//학생수 1씩 증가
					count++;
				}
				break;
				
			case 2:	
			
			}//switch
			
			
		}//while

	}

}
