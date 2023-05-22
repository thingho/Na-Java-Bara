package j0522_01;

public class Product {
	
	static int count=0; //클래스 변수 - 객체선언 없이 클래스명.변수명
	int serialNo; //인스턴스 변수 - 객체선언 후 참주변수명.변수명
	{ //인스턴스 초기화블럭
		++count;
		serialNo = count;
	}
	
	Product(){} //기본생성자

}
