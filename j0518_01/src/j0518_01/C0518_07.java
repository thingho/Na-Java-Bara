package j0518_01;

import java.util.Scanner;

public class C0518_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1~100까지의 랜덤숫자를 생성해서 숫자를 맞추는 프로그램 구현
		//횟수 10번만 가능
		
		int[] input = new int[10];


		
		System.out.println("숫자를 입력하세요.>>");
		for(int i=0;i<input.length;i++) {
			int random = (int)(Math.random()*100)+1;
			input[i] = scan.nextInt();
			if(input[i]==random) {
				System.out.println("입력한 숫자 : "+input[i]);
				System.out.println("랜덤숫자 : "+random);
				System.out.println("숫자가 같습니다!");
				break;
			}else {
				System.out.println("입력한 숫자 : "+input[i]);
				System.out.println("랜덤숫자 : "+random);
				System.out.println();
				System.out.println("숫자가 다릅니다 다시 입력하세요!");
				continue;
			}
		}//for
		
		System.out.print("내가 입력한 번호 : ");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		

	}

}
