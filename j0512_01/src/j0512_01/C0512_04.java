package j0512_01;
import java.util.Scanner;

public class C0512_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//10진수를 2진수로 변경하는 프로그램
		String[] binary = {"0000","0001","0010","0011","0100",
				           "0101","0110","0111","1000","1001"};
		
		//binary[0];
		//binary[1],binary[2],binary[3],binary[4],binary[5]
		//binary[6],binary[7],binary[8],binary[9]
		
		//배열 생성
		int[] num = new int[4];
		
		//1025 - 0001 0000 0010 0101
		//1개씩 번호 입력
		for(int i=0;i<num.length;i++) {
			System.out.println("번호를 입력하세요.");
			num[i] = scan.nextInt();
		}

		//10진 코드로 번호출력
		System.out.println("10진코드");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();

		//2진 코드로 번호출력
		System.out.println("이진코드");
		for(int i=0;i<num.length;i++) {
			System.out.print(binary[num[i]]+" ");
		}
		System.out.println();
		
	}

}
