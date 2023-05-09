package j0508_01;

public class Class0508_07 {

	public static void main(String[] args) {
		//printf : 출력 후 자동 enter키가 없어 \n을 작성해줘야함
		//println : 출력형식 지정불가(10진수만 출력가능), 출력 후 enter키가 포함, /t : tab을 자동으로 설정
		//print
		
		// 단축키 -> sysout 친 후 ctrl + 스페이스바
		System.out.println(10/3.0);  //뒤에 f가 없으므로 float이 아니라 double이다
		System.out.printf("%.5f", 10/3.0); //실수형
		System.out.printf("%9d \n", 1000);  // 정수형
		System.out.printf("%x \n", 16);  //16진수
		System.out.printf("%o", 9);  //8진수
		System.out.printf("당신의 나이 : %d 세, 생년 %d 년 \n", 25, 86);
		System.out.printf("당신의 나이 : "+25+" 세, 생년 : "+1986+" 년");
		
		//%b : 불리언 형식으로 출력, %d : 10진 정수 형식, %o : 8진 정수 형식, %x : 16진 정수 형식
	}

}
