package j0511_01;

public class C0511_12 {

	public static void main(String[] args) {
		int num = 5;
		int num2 = num;
		num2 = 10;
		System.out.println(num);
		System.out.println(num2);
		System.out.println("---------------------------------------");
		
		//배열을 복사할 때 데이터의 값을 그냥 넣으면 안됨 -> 배열복사를 사용해야 함 
		int[] input = new int[3];
		input[0] = 5;
		
		int[] input2 = input;
		System.out.println(input2[0]);
		input[0] = 20;
		System.out.println(input2[0]);
		System.out.println(input[0]);
	}

}
