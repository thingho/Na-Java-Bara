package j0526_01;

import java.util.Scanner;

public class C0526_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String lotto = "1";
		//String lotto2 = "1조12587";
		//1-9조 00000-99999
		//0-9 랜덤숫자를 맞추는 게임	
		
		
		//랜덤숫자 random
		//입력숫자 myNum
		int random = (int)(Math.random()*10);
		System.out.println("1조를 입력해주세요");
		String strNum = scan.next(); //1조12587 입력
		String result = strNum.substring(0,1);
		int myNum = Integer.parseInt(result); //입력받은 문자열 1을 숫자1로 변경
		
		if(random==myNum) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
		
		
		
		

	}

}
