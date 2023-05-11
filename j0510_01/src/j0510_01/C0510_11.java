package j0510_01;

import java.util.Scanner;

public class C0510_11 {

	public static void main(String[] args) {
		//숫자를 10번 반복해서 입력받아, 합을 출력하시오
		int num;
		int sum = 0;
		int i = 0;
		Scanner scan = new Scanner(System.in);
		while(i<10) {
			System.out.println((i+1)+"번쨰 숫자를 입력하세요");
			num = scan.nextInt();
			sum += num;
			i++;
			}
		System.out.println("합계 : "+sum);
		}
	}