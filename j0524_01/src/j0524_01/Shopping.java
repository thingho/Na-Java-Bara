package j0524_01;

public class Shopping {

	public static void main(String[] args) {
		System.out.println("[ 쇼핑몰 프로그램 ]");
		System.out.println("1. Stv");
		System.out.println("2. Computer");
		System.out.println("3. Audio");
		System.out.println("----------------------------");
		System.out.println("구매하고 싶은 번호를 입력하세요");
		
		Buyer b = new Buyer();
		
		//티비 3대 구매 -> Stv s = new Stv();
		b.buy(new Stv());
		b.buy(new Stv());
		b.buy(new Stv());
		
		//컴퓨터 2대 구매
		b.buy(new Computer());
		b.buy(new Computer());
		
		//오디오 구매
		b.buy(new Audio());
		System.out.println("잔액 : "+b.money);
		System.out.println("보유 포인트 : "+b.bonusPoint);
		
		
		


	}

}
