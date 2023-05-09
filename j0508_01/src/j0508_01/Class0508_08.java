package j0508_01;

public class Class0508_08 {

	public static void main(String[] args) {
		// 문제1) int로 선언할 것 : num1 변수 10,  num2 변수 3 을 선언 후 , 소수점 2자리까지 출력하시오
		int num1 = 10;
		int num2 = 3;
		System.out.printf("%.2f", num1/(float)num2);
		System.out.println(10/3.0);
		
		// 문제2) 변수 n1 : 3.14, 변수 n2 : 5
		float n1 = 3.14f;
		int n2 = 5;
		System.out.printf("[ n1+n2의 결과값 : %.2f ]를 출력하시오.\n", n1+n2);
		
		// 문제3) 국어점수 kor 100, 영어점수 eng 100, 수학점수 math 99
		int kor = 100;
		int eng = 100;
		int math = 99;
		System.out.printf("[ 힙계 : %d, 평균 : %.2f ] \n", kor+eng+math, (float)(kor+eng+math)/3);
		
		// 문제3-1) 국어점수 kor 100, 영어점수 eng 100, 수학점수 math 99 -> total 변수와 avg 변수 선언
		int kor1 = 100;
		int eng1 = 100;
		int math1 = 99;
		int total1 = kor1+eng1+math1;
		double avg1 = total1/3.0;
		System.out.printf("[ 힙계 : %d, 평균 : %.2f ]", total1, avg1);
		
		}

}
