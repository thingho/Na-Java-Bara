package j0517_01;

import java.util.Scanner;

public class C0517_04 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 가장 큰 수를 출력하시오
		// numMax 메소드를 만들어 사용하시오
		Scanner scan = new Scanner(System.in);
		
		//객체 선언 -> 클래스명 참조변수명 = new 클래스명
		C0517_04 c = new C0517_04();
		//배열선언
		int[] num = new int[3];
		//변수선언
		int max=0;
		int num1=0,num2=0,num3=0;
		
		while(true) {
			for(int i=0;i<3;i++) {
				System.out.println((i+1)+"번째 숫자를 입력하시오.>>");
				num[i] = scan.nextInt();
			}
			//다른 메소드 호출방법 -> 참조변수명.메소드명 - 매개변수는 같아야 한다
			int result = c.max(1, num[0], num[1], num[2]);
			int result2 = c.max(2, num[0], num[1], num[2]);
			
			System.out.println("3개의 수의 최댓값 : "+result);
			System.out.println("3개의 수의 최솟값 : "+result2);
		}
		
		
//		//삼항식
//		max =  (num1>num2)?((num2>num3)?num2:num3):((num2>num3)?num2:num3);

//		//Math.Max()
//		max = Math.max(Math.max(num1, num2),num3);
//		
//		//if - 5 15 25
//			if (num1 > num2) {
//				if (num1 > num3) {
//					max = num1;
//				} else {
//					max = num3;
//				}
//			} else {
//				if (num2 > num3) {
//					max = num2;
//				} else {
//					max = num3;
//				}
//			}


	}//main
	
	//메소드 리턴타입과 return 변수는 타입이 같아야한다
	//1. 최댓값
	int max(int check, int a, int b, int c) {
		int result = 0;
		if(check==1) {
			//최댓값 구하기 -> Math.Max()
			result = Math.max(Math.max(a,b),c);			
		}else {
			//최솟값 구하기 -> Math.Min()
			result = Math.min(Math.min(a,b),c);			
		}
		return result;
	}
	

}//class
