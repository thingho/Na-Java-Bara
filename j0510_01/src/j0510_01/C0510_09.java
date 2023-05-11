package j0510_01;

import java.util.Scanner;

public class C0510_09 {

	public static void main(String[] args) {
		//숫자를 3번 반복해서 입력받아, 합을 출력하시오
		int num;
		int sum = 1;
		int i = 1;
		Scanner scan = new Scanner(System.in);
		for(i=0;i<3;i++) {
			System.out.println((i+1)+"숫자를 입력하시오");
			num = scan.nextInt();
			sum += num;
		}
		System.out.println(sum);
		

	}

}
