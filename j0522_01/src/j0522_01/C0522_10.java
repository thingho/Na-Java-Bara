package j0522_01;

public class C0522_10 {

	public static void main(String[] args) {
		//원 그릴 객체 선언
		Circle c = new Circle();
		Point center = new Point(150,150);
		Circle c2 = new Circle(center, 50); //위에 문장이 center에 바로 들어와도 된다
		//c2 변수 -> center의 x=150,y=150 그리고 r=50
		
		//배열 선언을 할 때 객채 안에는 객체를 집어 넣어야 함
		Point[] p = {new Point(100,100), new Point(140,50), new Point(200,100)};
		
		//Triangle 객체 선언
		Triangle t = new Triangle(p);
		Triangle t2 = new Triangle(p[0],p[1],p[2]);
		
		// Point center = new Point(0,0);
		// x = 0, y = 0;
		// r =100;

	}

}
