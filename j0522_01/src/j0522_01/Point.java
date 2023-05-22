package j0522_01;

public class Point {
	int x; //인스턴스 변수 -> 객체 선언 후 참조변수명.변수명
	int y;
	
	//기본 생성자 -> 클래스명 일치, void 없음
	Point(){ 
		this(0,0); //다른 생성자 호출
	}
	
	//매개변수가 포함된 생성자
	Point(int x, int y){
		this.x=y; //this:인스턴스변수, x:지역변수->메소드내
		this.y=x;
	}

}
