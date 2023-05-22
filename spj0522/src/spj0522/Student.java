package spj0522;

public class Student {
	
	static String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	
	static int count=1000; //클래스 변수 -> 객체 선언 없이 클래스명.변수명
	int stuNo;			  //인스턴스 변수 -> 객체 선언 후 참조변수명.변수명
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{ //초기화
		count++;
		stuNo = count;
	}
	
	Student(){}  //생성자 - 클래스명과 일치, void 없음
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg= this.total/3.0;
	}

}
