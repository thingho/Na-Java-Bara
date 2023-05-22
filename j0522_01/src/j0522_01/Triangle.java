package j0522_01;

//삼각형 -> 점이 3개 필요
public class Triangle extends Shape {
	Point[] p; //인스턴스 배열 변수 -> 객체 선언후 참조변수명.변수명
	
	Triangle(Point[] p){
		this.p = p;
	}
	
	Triangle(Point p1, Point p2, Point p3){
		//Point[] p = {p1,p2,p3};
		p = new Point[]{p1,p2,p3};
	}

}
