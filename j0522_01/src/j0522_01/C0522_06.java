package j0522_01;

public class C0522_06 {
	
	//인스턴스 변수 -> C0522_06(){} 기본생성자 자동생성
	//인스턴스 변수는 자동으로 초기화가 된다
	int x;
	int y=x;
	char ch;
	String str;

	public static void main(String[] args) {
		
		//지역변수 변수는 항상 초기화를 해줘야한다
		int a=0;
		int b=a;
		
		int num=0,num1=0;
		long num2=0;
		
		//a,b,x,y를 출력하시오
		//지역변수는 그냥 사용하면 됨
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		//인스턴스 변수를 출력하려면 객체 선언을 해야함
		//객체 선언 후 참조변수명.변수명 형태
		C0522_06 c = new C0522_06();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println("ch : "+c.ch); //빈 공백
		System.out.println("str : "+c.str); //참조형 변수이기 때문에 null

	}

}
