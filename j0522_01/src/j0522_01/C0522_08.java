package j0522_01;

public class C0522_08 {

	public static void main(String[] args) {
		
		//int count = 0;
		//int serialNo = 0;
		//초기화블럭 = count=1, serialNo=1
		
		//객체 선언후 
		//serialNo값은 1
		Product p = new Product();
		System.out.println("p count : "+p.count);
		System.out.println("p serialNo : "+p.serialNo);
		System.out.println();
		
		//serialNo값은 2
		Product p2 = new Product();
		System.out.println("p2 count : "+p2.count);
		System.out.println("p2 serialNo : "+p2.serialNo);
		System.out.println();
		
		//serialNo값은 3
		Product p3 = new Product();
		System.out.println("p3 count : "+p3.count);
		System.out.println("p3 serialNo : "+p3.serialNo);
		
		//클래스 변수 - 객체선언 없이 클래스명.변수명로 무조건 해줘야한다
	}

}
