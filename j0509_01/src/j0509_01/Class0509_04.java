package j0509_01;

import java.util.Scanner;

public class Class0509_04 {

	public static void main(String[] args) {
		// 아이디, 패스워드, 이름을 입력받아 출력하시오
		// 문자열, 정수형, 문자열
		
		// 1. 변수 선언
		String id;
		// 0을 입력받으려면 String으로 변수 선언을 해야함
		int pw;
		String name;

		// 2. Scanner 입력클래스
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력하시오");
		//next() : 문자만 입력받음, nextLine() : 해당 문장을 모두 입력받음(띄어쓰기, 엔터키 등)
		id = scan.nextLine();
		System.out.println("패스워드를 입력하시오");
		pw = scan.nextInt();
		scan.nextLine();   //nextInt() enter키를 입력으로 사용
		System.out.println("이름을 입력하시오");
		name = scan.nextLine();
		
		// 3. 출력
		System.out.println("-----------------------------------------------------");
		System.out.println("아이디\t패스워드\t이름");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%s\t%d\t%s", id, pw, name);

	}

}
