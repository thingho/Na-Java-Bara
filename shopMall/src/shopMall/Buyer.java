package shopMall;

import java.util.ArrayList;

public class Buyer {
	
	//기본 생성자
	Buyer(){}
	
	//매개변수가 있는 생성자
	Buyer(String id, String name, String nickName){
		this.id = id;
		this.name = name;
		this.nickName = nickName;
	}
	
	// 배열 선언
	//Product[] cart = new Product[10]; 
	//cart[0]=p;
	
	//배열 대신 Collection
	ArrayList<Product> list = new ArrayList(); 
	//Product와 연관 되어 있는거만 나올 수 있음 
	
	//cart[i]=p , list.add(p); -> 객체추가  Object o =new Product();
	//cart[0] , list.get(0); -> 읽어오기
	//cart.length , list.size; -> 총개수
	
	String id;
	String pw;
	String name;
	String nickName;
	
	int money = 500;
	int bonusPoint = 0;
	
	//Product p = new Tv();
	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("보유금액이 부족해서 상품을 구매할 수 없습니다.");
			return;
		}
		money =  money - p.price; // tv의 가격을 빼고 다시 money에 넣음.
		bonusPoint = bonusPoint + p.bonusPoint; //현재 보너스에 추가해서 다시 보너스에 넣음.
		System.out.println("구매 : "+p.productName);
		list.add(p); //list에 데이터 추가
	}
	
	//구매목록
	void buylist() {
		System.out.print("구매목록 : ");
		for(int i=0;i<list.size();i++) {
			//Product p = (Product)list.get(i);  //타입은 Object
			if(i==0)
				System.out.print(list.get(i).productName);
			else 
				System.out.print(","+list.get(i).productName);
		}
		System.out.println();
	}

//	//티비
//	void buy(Tv t) {
//		money = money - t.price; // tv의 가격을 빼고 다시 money에 넣음
//		bonusPoint = bonusPoint + t.bonusPoint; //현재 보너스에 추가해서 다시 보너스에 넣음
//		System.out.println(t);
//	}
//
//	//컴퓨터
//	void buy(Computer c) {
//		money = money - c.price;
//		bonusPoint = bonusPoint + c.bonusPoint;
//		System.out.println("구매 : "+c.productName); //override를 선언 하지 않았기 때문에
//	}
//	
//	//스피커
//	void buy(Speaker s) {
//		money = money - s.price;
//		bonusPoint = bonusPoint + s.bonusPoint;
//		System.out.println("구매 : "+s.productName);
//	}
//	
//	//세탁기
//	void buy(Washer w) {
//		money = money - w.price;
//		bonusPoint = bonusPoint + w.bonusPoint;
//		System.out.println("구매 : "+w.productName);
//	}

}
