package shopMall;

public class Tv extends Product {
	
	int inch = 70;
	
	Tv(){ //생성자
		productName = "QLED";
		price = 150;
		bonusPoint = 15;
		sale = 10;
	}
	
	@Override
	public String toString() {
		return "구매 : "+productName;
	}

}
