package j0508_01;

public class Class0508_04 {

	public static void main(String[] args) {
		long num = 2200000000L;  //
		long num2 = 0;
		char ch = 'A';
		// char ch2 = 'AB';
		char ch3 = ' ';
		String str1 = "";
		
		String str2 = "a"+"b";
		System.out.println(str2);
		
		int num3 = 7;
		int num4 = 7;
		String num5 = "7";
		System.out.println(num3+num4);  //14
		System.out.println(num3+num4+num5);  //147
		System.out.println(num5+num4+num3);  //777
		
		System.out.println("결과값 : "+num3+num4);  //77
		System.out.println("결과값 : "+(num3+num4));  //14 -> 괄호를 넣음으로서 14를 나오게 함
	}

}
