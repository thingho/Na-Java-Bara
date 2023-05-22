package j0522_01;

public class Car {
	
	String color;
	String gearType;
	int door;
	
	//1. 기본생성자
	Car(){
		//this("white","auto",4);
		color = "white";
		gearType = "auto";
		door = 4;
	}

	//2. 다른 생성자
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	//Car라는 객체의 참조변수를 받음
	Car(Car c){
		//this(c.color, c.gearType, c.door); -> 다른 생성자를 가르킴
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

}
