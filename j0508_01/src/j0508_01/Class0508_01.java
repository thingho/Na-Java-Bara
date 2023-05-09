package j0508_01;

public class Class0508_01 {
	boolean temp = true;
	boolean temp2 = false;
	boolean temp3;
	temp3 = true;

	 // char 은 절대적으로 홀따옴표 만 하여야 한다. 쌍따옴표 노노
	char ch1 = ' ' ;  //문자형 타입
	char ch2 = 'a'; //  '  ' 만 사용가능
	char ch3 = 'A'; // ''
	char ch4 = 't';
	//char ch5 = "  "; // " "; " '" 사용 불가능함
	byte num1 = 1;
	//byte num3 = 256; //127 까지 숫자표현 가능 // option + shift + 방향키로 주석 옮김
	short num2 = 10;
	//short num4 = 32768;  32768까지 숫자표현 가능

	int num5 = 21;
	//int num6 2147483648  // 214748364까지 숫자표현 가능
	long num7 = 21; //  L 을 꼭 붙여줘야 한다.
	long num8 = 2147483648L; //  접미사 L,l 를  꼭 붙여 사용하여야함.

	float num9 = 9.87654321111111f;  // 실수형 8짜리 정밀도 표현 가능
	float num10 = 987.65432100000f; // 접미사 F,f를 붙여야 함.

	double num11 = 1.1234456789012345;  // 실수형 16자리 까지 정밀도 표현 가능

	//문자열 - class일때 대문자 표현
	String str1 = new String("abc");

	String str="aaa"; // 기본형 타입으로 선언 (예외)

	char str3= "   ";
	String str4 = "";

	//변수
	int score = 100;
	score = score + 200; //score 300이라는 값이 들어감.

	//상수
	final int SCO = 100;
	//SCO = 200; //상수는 값을 변경할 수 없음.

	boolean power = true;

	char ch = 'A';
	System.out.println(power); // 시스템에 출력해라.

	//main

}
