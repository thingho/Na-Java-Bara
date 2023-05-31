package j0530_01;

import java.util.Scanner;

public class C0530_03 {
	
	public static void main(String[] args) {
		//소문자를 대문자로 출력하시오. a=97,A=65,0=48 (입력된 문자 1개 치환)
		Scanner scan = new Scanner(System.in);
//		System.out.println("영문소문자를 입력하세요.");
//		char input = scan.next().charAt(0);
//		System.out.println("입력한 문자는 : "+input);
//		char output = (char) (input-32); //char+int = int+int = int (형변환 ->char)
//		System.out.println("대문자 : "+input);
		
		//소문자->대문자, 대문자->소문자로 출력하시오=
		//a=97, z=64, A=65, Z=96, 0=48
//		System.out.println("영문자를 입력해주세요.>>");
//		char input = scan.next().charAt(0);
//		if((('a'<=input) && ('z'>=input))==true) {
//			char output1 = (char)(input-32);
//			System.out.printf("소문자 %s에서 -> 대문자 %s로 변경",input,output1);
//		}else if((('A'<=input) && ('Z'>=input))==true) {
//			char output2 = (char)(input+32);
//			System.out.printf("대문자 %s에서 -> 소문자 %s로 변경",input,output2);
//		}
		
		String str = "ABCDEF";
		System.out.println(str.toLowerCase());
		String str2 = "abcedf";
		System.out.println(str2.toLowerCase());
		
		//들어오는 모든 문자열을 대문자는 소문자, 소문자는 대문자로 변경하시오
		System.out.println("영문자를 입력해주세요.>>");
		String input = scan.next();
		String output ="";
		char temp=' ';
		for(int i=0;i<input.length();i++) {
			temp = input.charAt(i); 
			System.out.println(temp);
			//여기서는 이 코드가 가장 중요
			if((('a'<=temp) && ('z'>=temp))==true) {
				output = output+(char)(temp-32);
			}else if((('A'<=temp) && ('Z'>=temp))==true) {
				output = output+(char)(temp+32);
			}
			
		}//for
		System.out.println("입력된 문자 : "+input);
		System.out.println("출력된 문자 : "+output);
		
		
	}

}
