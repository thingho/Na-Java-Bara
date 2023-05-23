package j0522_01;

public class Circle extends Shape{
	
	//다른 클래스를 사용하려면 객체 선언 후 참조변수명.변수명
	Point center; //참조변수를 받을 수 있는 주소변수만 존재
	int r; //인스턴스 변수 -> 객체 선언 후 참조변수명.변수명
	
	//기본생성자
	Circle(){
		this(new Point(0,0),100); //this -> 다른생성자 호출
	}
	
	//생성자
	Circle(Point center, int r){
		this.center = center; //this -> 인스턴스 변수 호출
		this.r = r;
	}
	

}//Circle
