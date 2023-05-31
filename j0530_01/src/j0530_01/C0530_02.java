package j0530_01;

import java.util.Scanner;

public class C0530_02 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String domain = "https://forum.nexon.com";
		String url = "https://forum.nexon.com/fifamobile";
		String input = url.substring(domain.length()+1);
		String[] files = {"fifamobile", "asgard", "GODZILLADF", "csonline"};
		
		System.out.println(domain.length());
		System.out.println(url.substring(24));
		System.out.println("파일명 : "+input);
		System.out.println();
		
		
		System.out.println("원하는 페이지를 호출하시오.>>");
		input = scan.next();
		
		//files 배열에 1에 있습니다.
		//1. switch문 사용
//		switch(input) {
//		case "fifamobile":
//			System.out.println("fifamobile 페이지를 열어줍니다.");
//			break;
//		case "asgard":
//			System.out.println("asgard 페이지를 열어줍니다.");
//			break;
//		case "GodzillaDF":
//			System.out.println("GodzillaDF 페이지를 열어줍니다.");
//			break;
//		case "csonline":
//			System.out.println("csonline 페이지를 열어줍니다.");
//			break;
//		}//switch
		
		//2. 대소문자 구분없이 입력받아 출력하기 -> equalsIgnoreCase()
		if(input.equalsIgnoreCase(files[0])) {
			System.out.printf("fifamobile 페이지를 열어줍니다.");
		}else if(input.equalsIgnoreCase(files[1])) {
			System.out.println("asgard 페이지를 열어줍니다.");
		}else if(input.equalsIgnoreCase(files[2])) {
			System.out.println("GodzillaDF 페이지를 열어줍니다.");
		}else {
			System.out.println("csonline 페이지를 열어줍니다.");
		}


	}//main

}//class
