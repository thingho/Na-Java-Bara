package j0522_01;

public class C0522_05 {

	public static void main(String[] args) {
		//1. 기본 생성자로 출력하기
		Car c = new Car();
		System.out.println(c.color);
		System.out.println(c.gearType);
		System.out.println(c.door);
		System.out.println();
		
		
		//2. 매개변수가 있는 생성자를 사용하여 red, auto, 5를 출력하시오
		Car c2 = new Car("red","auto",5);
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
		System.out.println();
		
		//3. 객체선언
		//객체(=인스턴스)를 복사할 때 사용
		Car c3 = new Car(c2);
		
		c3.color = "blue";
		c3.gearType = "stick";
		c3.door = 3;
		//blue, stick, 3
		
		//4.
		Car c4 = new Car(c3);
		
		c4.color = "yellow";
		c4.gearType = "auto";
		c4.door = 4;
		//yellow,auto,4

		
		
		//객체(=인스턴스)를 복사할 때 사용 
//		Car c3 = new Car(c2);
//		System.out.println(c3.color);
//		System.out.println(c3.gearType);
//		System.out.println(c3.door);

		//참조변수만 선언
//		Car c3 = null;
//		//복사가능~ 하지만 
//		c3 = c2;
//		System.out.println(c2.color);
//		System.out.println(c3.color);System.out.println();
//		System.out.println();
//		
//		c3.color = "blue";
//		System.out.println("c2 : "+c2.color);
//		System.out.println("c3 : "+c3.color);
	}

}
