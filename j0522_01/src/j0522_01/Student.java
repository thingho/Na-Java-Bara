package j0522_01;

public class Student {
	
	static int count=1000; //클래스 변수
	int stuNo; //20231011001
	String name; //인스턴스 변수
	int kor;
	int eng;
	int math;
	int total;
	int avg;
	int rank;
	
	{ //초기화블럭
		++count; //1001
		//stuNo = "2023"+ String.format("%04d", 11);
		stuNo = count; //1001, 1002, 1003, 1004 ......
	}
	
	//기본 생성자
	Student(){}
	
	Student(String name, int kor, int eng, int math){ //지역변수 -> 메소드 내에 사용함
		this.name = name; //지역변수 name을 말함
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3;
	}

}
