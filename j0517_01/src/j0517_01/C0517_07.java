package j0517_01;

public class C0517_07 {

	public static void main(String[] args) {
		
		//static -> 객체선언 없이 사용가능
		int[] num = new int[2];
		
		int a = 10;
		int b = 5;
		
		calulate(num,a,b);
		
		System.out.println("합계 : "+num[0]); //15
		System.out.println("평균 : "+num[1]); //7
		
	}
	
	static void calulate(int[] num, int a, int b) {
		//두 수의 합, 평균
		num[0] = a+b;
		num[1] = (a+b)/2;
		//return은 무조건 하나만 가능
	}

}
