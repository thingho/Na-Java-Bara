package shopMall;

public class ShopMain {

	public static void main(String[] args) {
		System.out.println("[ 쇼핑몰 프로그램 ]");
		System.out.println("1. QLED TV 70인치");
		System.out.println("2. 갤럭시 북");
		System.out.println("3. 홈 미니 블루투스 스피커");
		System.out.println("----------------------------");
		System.out.println("구매하고 싶은 번호를 입력하세요");
		System.out.println();
		
		//id, name, nickName
		Buyer b = new Buyer("hong","홍길동","길동쓰");
		
		//티비 구매
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		
		//컴퓨터 구매
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		//스피커 구매
		b.buy(new Speaker());
		b.buy(new Speaker());
		b.buy(new Speaker());
		b.buy(new Speaker());
		//그랑데 세탁기 구매
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Washer());
		
		//
		System.out.println("잔액 : "+b.money);
		System.out.println("구매갯수 : "+b.list.size()+"개");
		
		b.buylist();
		System.out.println();
		
		
		
		

	}

}
