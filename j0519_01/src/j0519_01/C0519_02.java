package j0519_01;

import java.util.Scanner;

public class C0519_02 {

	//main 메소드
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] s = new Student[10]; //배열 선언
		String[] name = new String[10];
		String searchName=""; //검색할 이름변수
		int choice=0; //원하는 번호 입력하는 변수
		int count=0; //입력된 학생수
		int check=0; //학생이 있는지 확인하는 변수
		
		loop:while(true) {
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
				for(int i=count;i<s.length;i++) {
					s[i] = new Student(); //객체 생성
					
					System.out.println((i+1)+"번째 학생 이름을 입력하세요.(0.이전페이지로 이동)");
					s[i].name = scan.next();  //이름 입력
					if(s[i].name.equals("0")) {
						System.out.println("[ 이전페이지로 이동합니다 ]");
						System.out.println();
						break;
					}
					
					//국어,영어,수학 성적 입력
					System.out.println("국어점수를 입력하세요");
					s[i].kor = scan.nextInt();
					System.out.println("영어점수를 입력하세요");
					s[i].eng = scan.nextInt();
					System.out.println("수힉점수를 입력하세요");
					s[i].math = scan.nextInt();
					
					//합계,평균
					s[i].sum();
					s[i].average();
					
					count++; //입력시 학생수 1명씩 증가
				}
				break;
			
			case 2:
				System.out.println("[ 학생성적 ]");
				//String[] title = Student.title;
				//클래스 변수 사용법 - 클래스명, 변수명
				// 상단타이틑 출력
				for(int i=0;i<Student.title.length;i++) {
					System.out.print(Student.title[i]+"\t");
				}
				System.out.println();
				System.out.println("--------------------------------------------------------");
				
				//입력된 성적출력
				for(int i=0;i<count;i++) {
					System.out.print(s[i].name+"\t");
					System.out.print(s[i].kor+"\t");
					System.out.print(s[i].eng+"\t");
					System.out.print(s[i].math+"\t");
					System.out.print(s[i].total+"\t");
					System.out.printf("%.2f\t",s[i].avg);
					System.out.print(s[i].rank+"\n");
				}
				System.out.println();
				break;
			
			case 3:
				check=0; //초기화
				System.out.println("[ 학생성적 수정 ]");
				System.out.println("수정할 학생의 이름을 입력하세요.(0.이전페이지 이동)");
				searchName = scan.next();
				
				//0번 이전페이지 이동인지 비교
				if(searchName.equals("0")) {
					System.out.println("이전페이지로 이동합니다");
					System.out.println();
					break; //switch
				}
				
				//수정할 학생의 이름을 비교하기 위해 반복문
				for(int i=0;i<count;i++) {
					if(s[i].name.equals(searchName)) {
						System.out.printf("[ %s 학생이 검색되었습니다 ] \n",searchName);
						System.out.println("1. 국어점수");
						System.out.println("2. 영어점수");
						System.out.println("3. 수학점수");
						System.out.println("----------------------------");
						System.out.println("수정할 과목을 선택하세요.>>");
						choice = scan.nextInt();
						
						switch(choice) {
						case 1:
							System.out.printf("[ 이전 국어점수 : %d ] \n",s[i].kor);
							System.out.println("수정할 점수를 입력하세요.>>");
							s[i].kor = scan.nextInt();
							s[i].sum(); //합계수정
							s[i].average(); //평균수정
							System.out.println("[ 국어점수 수정완료 ]");
							System.out.println();
							break;
							
						case 2:
							System.out.printf("[ 이전 영어점수 : %d ] \n",s[i].eng);
							System.out.println("수정할 점수를 입력하세요.>>");
							s[i].eng = scan.nextInt();
							s[i].sum(); //합계수정
							s[i].average(); //평균수정
							System.out.println("[ 영어점수 수정완료 ]");
							System.out.println();
							break;
							
						case 3:
							System.out.printf("[ 이전 수학점수 : %d ] \n",s[i].math);
							System.out.println("수정할 점수를 입력하세요.>>");
							s[i].math = scan.nextInt();
							s[i].sum(); //합계수정
							s[i].average(); //평균수정
							System.out.println("[ 수학점수 수정완료 ]");
							System.out.println();
							break;	
						}//switch
						check=1; //학생이 존재시 1로 변경
					}//if
					break;
				}//for
				
				//학생이 존재하지 않을 때
				if(check==0) {
					System.out.printf("[ %s 학생은 존재하지 않습니다 ] \n",searchName);
					System.out.println();					
					break;
				}
				break;
				
			case 4: //등수처리
				System.out.println("[ 등수처리 ]");
				//등수처리 for문
				for(int i=0;i<count;i++) { //등록된 학생수만큼 비교
					int rankCount = 1; //등수 1부터 시작하기 때문에
					for(int j=0;j<count;j++) {
						if(s[i].total<s[j].total) { //다른학생성적이 더 높으면
							rankCount++;
						}
					}//for
					s[i].rank = rankCount; //변수를 등수변수에 저장
				}//for
				System.out.println("등수처리가 완료되었습니다!!");
				System.out.println();
				break;
				
			case 5:
				System.out.println("[ 학생 검색 ]");
				System.out.println("검색할 학생이름을 입력하세요.(0.이전페이지 이동)");
				searchName = scan.next();
				
				//0번 이전페이지 이동인지 비교
				if(searchName.equals("0")) {
					System.out.println("이전페이지로 이동합니다");
					System.out.println();
					break; //switch
				}
				
				check=0;
				for(int i=0;i<count;i++) {
					if(s[i].name.contains(searchName)) {
						check=1;
					}//if
				}//for
				
				if(check==0) {
					System.out.println("[ 검색한 이름은 존재하지 않습니다. ]");
					System.out.println();
				}
				break;
			
			case 0:
				System.out.println("[ 프로그램을 종료합니다. ]");
				break loop; //0 입력시 프로그램 종료
				
			}//switch
			
		}//while

	}//main
	
	static void recordTitle() {
		
	}

}//class
