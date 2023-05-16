package j0516_01;

public class Student {
	String name = "";
	int kor=0;
	int eng=0;
	int math=0;
	int total=0;
	double avg=0;
	int rank;
	
	void sum() {
		total=kor+eng+math;
	}
	
	void average() {
		avg=total/3.0;
	}

}
