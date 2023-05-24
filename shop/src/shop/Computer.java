package shop;

public class Computer extends Product {
	
	String cpu = "i7-10700";
	int hard = 5000;
	
	Computer(){ //생성자
		productName = "LG gram";
		price = 200;
		bonusPoint = 20;
		sale = 10;
	}
	
	@Override
	public String toString() {
		return "구매 : "+productName;
	}

}
