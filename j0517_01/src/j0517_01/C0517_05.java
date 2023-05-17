package j0517_01;

import java.util.Scanner;

public class C0517_05 {

	public static void main(String[] args) {
		// 3개의 수를 입력받아, 평균 60점 이상이면 합격, 아니면 불합격을 출력
		//average() return int
		Scanner scan = new Scanner(System.in);
		
		//객체 선언 -> 클래스명 참조변수명 = new 클래스명
		C0517_05 c = new C0517_05();
		//배열 선언
		int[] num = new int[3];
		//변수 선언
		double avgerage =0;
		int num1=0,num2=0,num3=0;
		
		while(true) {
			for(int i=0;i<3;i++) {
				System.out.println((i+1)+"번째 숫자를 입력하시오");
				num[i] = scan.nextInt();
			}
			//메소드 호출
			double result = c.average(num[0], num[1], num[2]);
			System.out.printf("평균 출력 : %.2f\n",result);
		}
		

	}//main
	
	//double average 메소드 생성
	double average(double a,double b,double c) {
		double result = (a+b+c)/3.0;
		return result;
	}

}//class
