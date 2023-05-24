package spj0522;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int choice=0; //지역변수 -> 메소드 내에 있어서
		String searchName = ""; //학생이름검색
		String name=" ";
		int check = 0; //검색시 없을 경우 사용
		int kor=0,eng=0,math=0;
		//Student[] s = new Student[10]; //배열 선언
		ArrayList<Student> list = new ArrayList(); //이것으로 인해 설정한 count 변수와 Student 배열이 필요 없어짐		
		//s[0] = new Student(); //객체 생성
		
		//무한 반복
		while(true) {
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적삭제");
			System.out.println("5. 학생검색");
			System.out.println("6. 등수처리");
			System.out.println("7. 오름차순 정렬");
			System.out.println("8. 내림차순 정렬");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			
			//프로그램 종료하기
			if(choice==0) {
				System.out.println("[ 프로그램을 종료합니다 ]");
				System.out.println();
				break;
			}
			
			switch(choice) {
			case 1: //성적입력
				stuInput(list); //메소드 분리
				break;
				
			case 2: //성적출력
				stuOutput(list);
				break;
				
			case 3: //성적수정
				System.out.println("수정할 학생이름을 입력하세요.>>");
				searchName = scan.next();
				check = 0; //검색 초기화
				for(int i=0;i<list.size();i++) {
					Student s = list.get(i);
					if(s.getName().equals(searchName)) {
						System.out.println("[ 학생이 검색되었습니다. ]");
						System.out.println("수정할 과목을 선택하세요.>>");
						System.out.println("1.국어");
						System.out.println("2.영어");
						System.out.println("3.수학");
						System.out.println("----------------------------------");
						System.out.println("번호를 입력하세요");
						choice = scan.nextInt();
						
						switch(choice) {
						//title[] -> 학번0,이름1,국어2,영어3,수학4,합계5,평균6,등수7
						case 1: //국어
							System.out.printf("[ 현재%s점수 : %d ]\n",Student.title[choice+1],s.getKor());
							System.out.printf("변경할 %s점수를 입력하세요.>> \n",Student.title[choice+1]);
							s.setKor(scan.nextInt()); //국어점수저장
							break;
							
						case 2:
							System.out.printf("[ 현재%s점수 : %d ]\n",Student.title[choice+1],s.getEng());
							System.out.printf("변경할 %s점수를 입력하세요.>> \n",Student.title[choice+1]);
							s.setEng(scan.nextInt()); //영어점수저장
							break;
						
						case 3:
							System.out.printf("[ 현재%s점수 : %d ]\n",Student.title[choice+1],s.getMath());
							System.out.printf("변경할 %s점수를 입력하세요.>> \n",Student.title[choice+1]);
							s.setMath(scan.nextInt()); //수학점수저장
							break;
						}
						
						//공통으로 사용하기 때문에 따로 빼냄
						s.setTotal(s.getKor()+s.getEng()+s.getMath()); //총합
						s.setAvg(s.getTotal()/3.0); //평균
						System.out.printf("%s점수가 수정되었습니다.>> \n",Student.title[choice+1]);
						System.out.println();
						check = 1;
					}//if
					
				}//for
				
				if(check==0) {
					System.out.println("[ 찾고자 하는 학생이 없습니다. 다시 입력하세요. ]"); 
					System.out.println();
				}
				break;
				
				
			case 0: //프로그램 종료
				break;
				
			}//switch
			
			
		}//while
		

	}//main
	
	//case 2 : 학생성적출력
	static void stuOutput(ArrayList<Student> list) { //ArrayCollection -> 객체의 배열
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \n",
				Student.title[0],Student.title[1],Student.title[2],Student.title[3],
				Student.title[4],Student.title[5],Student.title[6],Student.title[7]);
		System.out.println("----------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			//"학번","이름","국어","영어","수학","합계","평균","등수"
			Student s = list.get(i);
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d \n",
					s.getStuNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		System.out.println();		
	}//stuOutput
	
	//다른메소드 선언 - 리턴타입 메소드명(매개변수){ }, static 사용하여 객체 선언 안하기
	static void stuInput(ArrayList<Student> list) {
		
		String name="";
		int kor=0,eng=0,math=0;
		//학생입력
		for(int i=list.size();;i++) { //조건이 없어도 된다
			System.out.println((i+1)+"번째 이름을 입력하세요.(0.이전페이지 이동)");
			name = scan.next();
			
			//이전페이지 이동확인
			if(name.equals("0")) {
				System.out.println("[ 이전페이지로 이동합니다. ]");
				System.out.println();
				break;
			}
			
			System.out.println("국어점수를 입력하세요.>>");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			math = scan.nextInt();
			//객체 생성
			list.add(new Student(name, kor, eng, math));

		}//for

	}//메소드

	
}//class
