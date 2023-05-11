package j0510_01;

import java.util.Scanner;

public class C0510_07 {

	public static void main(String[] args) {
		
		//숫자를 입력받아 랜덤 숫자와 같은 값일 경우 정답 그렇지 않으면 오답 출력
		int random;
		int input;
		
		Scanner scan = new Scanner(System.in);
		random = (int)(Math.random()*10)+1; //1~10
		System.out.println("숫자를 입력하시오");
		input = scan.nextInt();
		if(input == random) {
			System.out.println("당첨!!!!");
		}else {
			System.out.println("꽝!!!!!");
		}
		System.out.println("입력한 숫자 : "+input);
		System.out.println("랜덤 숫자 : "+random);
		
		// 랜덤숫자
//		int random;
//		random = (int)(Math.random()*9)+1; //1~10
//		System.out.println(random);
	
		
		// 랜덤숫자
//		int random;
//		random = (int)(Math.random()*5)+1; //1~6
//		System.out.println(random);
		

	}

}
