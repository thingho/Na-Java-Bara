package j0516_01;

public class C0516_03 {
	
	//메소드
	public static void main(String[] args) {
		
		//변수 선언
		int a=0;
		String str = new String();
		String s = "aaa";
		
		//Tv라는 클래스에 객체 선언 -> 객
		Tv t = new Tv();
		t.color="white";
		System.out.println(t.color);
		
		//객체 선언
		Tv t2 = new Tv();
		t2.color="red";
	    System.out.println(t2.color);
		
	}

}
