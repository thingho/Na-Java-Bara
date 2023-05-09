package j0508_01;

public class Class0508_05 {
	public static void main(String[] args) {
		//정수 오버플로우 -> 최대, 최솟값을 넘어가면 연산이 거꿀로 돌아가고 실행
		//2147483647
		int num = 2147483647;
		System.out.println(num+2);
		
		int num1 = 1000000;
		int num2 = 2000000;
		System.out.println(num1*num2);  // 2,000,000,000,000
		
		int num3 = -2147483648;
		System.out.println(num3-1);  // 2,000,000,000,000
		
	}

}
