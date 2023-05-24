package j0524_01;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;
	
	Product[] cart = new Product[10];
	
	//3개를 Product가 모두 포함
	//Product p = new Stv();
	//Product p = new Computer();
	//Product p = new Audio();
	int count; //구매한 물건 갯수
	void buy(Product p) {
		money = money - p.price; 
		bonusPoint = bonusPoint + p.bonusPoint;
		cart[count] = p;
		count++;
	}

	
	

}
