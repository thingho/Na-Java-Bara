package j0508_01;

public class Class0508_03 {
	
	static int num;  //전역 변수 -> class영역에서도 변수선언 가능, 아무것도 설정하지 않으면 default값은 0 
	
	public static void main(String[] args) {
		int num = 0;  //지역 변수 -> 메소드 내에 사용하는 변수, 값을 무조건 설정해줘야 하며 설정해주지 않으면 에러가 뜸
		System.out.println("main메소드 num 호출 : "+num);
		sub();
	}
	// 함수 뒤에는 무조건 소괄화()
	static void sub() {
		//System.out.println(num); 이렇게는 사용 불가
		System.out.println("sub메소드 num 호출 : "+num);

}

}