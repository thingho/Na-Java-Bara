package j0518_01;

import java.util.Scanner;

public class C0518_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 자판기 프로그램
		//1. 밀크커피-300, 2.헤이즐넛커피-500 3.블랙커피-350 4.코코아-300 5.우유-400 6.잔액충전
		int money = 1000;
		int choice=0;
		
		loop:while(true) {
			System.out.println("[ 자판기 프로그램 ]");
			System.out.println("1.밀크커피-300");
			System.out.println("2.헤이즐넛커피-500");
			System.out.println("3.블랙커피-350");
			System.out.println("4.코코아-300");
			System.out.println("5.우유-400");
			System.out.println("6.잔액충전");
			System.out.println("0.프로그램종료");
			System.out.println("---------------------------");
			System.out.println("현재잔액 : "+money);
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1: //밀크커피 300원
				money = order(money,300,"밀크커피");
				break;
			
			case 2: //헤이즐넛커피 500원
				money = order(money,500,"헤이즐넛커피");
				break;
				
			case 3: //블랙커피 350원
				money = order(money,350,"블랙커피");
				break;
			
			case 4: //코코아 300원
				money = order(money,300,"코코아");
				break;
			
			case 5: //우유 400원
				money = order(money,400,"우유");
				break;
			
			case 6: //금액충전
				System.out.println("잔액을 충전합니다. 충전금액을 입력하세요.>>");
				int temp = scan.nextInt();
				if(temp>0) {
					System.out.println("결제수단 : 1. 카드결제");
					choice = scan.nextInt();
					if(choice==1) {
						money += temp;
						System.out.println("[ 카드결제가 완료되었습니다 ]");
						System.out.println("충전금액 : "+temp);
						System.out.println("현재잔액 : "+money);
						System.out.println();
					}else {
						System.out.println("[ 시스템에 오류가 있습니다. 다시 실행해 주세요 ]");
						System.out.println();
					}
				}
				break;
				
			case 0: //프로그램 종료
				System.out.println("프로그램을 종료합니다");
				break loop;
			}//switch
			
		}//while

	}//main
	
	//음료제조 메소드
	static int order(int money, int price, String title) {
		if(money>=price) {
			System.out.println(title+"가 나옵니다");
			money -= price;  //money = money - price			
		}else {
			System.out.println("잔액이 부족합니다 충전해주세요");
		}
		return money;
	}
	

}//class
