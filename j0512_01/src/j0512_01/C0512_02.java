package j0512_01;
import java.util.Scanner;

public class C0512_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또 프로그램 만들기
		
		//1.배열 생성
		int random=0; //랜덤 번호
		int temp=0;  //임시 저장소
		int count=0; //당첨 번호 갯수
		int[] myNum= new int[6]; //내가 입력한 번호
		int[] lottoNum = new int[6];  //당점번호
		int[] lotto = new int[45];  //로또 번호
		
		//2.로또 번호 생성
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;  //1,2,3,.....,45
		}
		
		//3.번호 섞기
		for(int i=0;i<lotto.length;i++) {
			random = (int)(Math.random()*45);  //0~44 랜덤번호
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}
		
		//4.번호입력
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+"번째 로또번호를 입력하세요");
			myNum[i] = scan.nextInt();
		}
		
		//5.로또번호 확인
		for(int i=0;i<6;i++) { //lotto배열
			for(int j=0;j<6;j++) { //myNum배열
				if(lotto[i]==myNum[j]) {
					//count 1씩 증가
					lottoNum[count] = lotto[i];  //당첨번호 넣기
					count++; //당첨개수 증가
					continue;
				}
			}
		}
		
		//6.로또번호 출력
		System.out.print("로또번호 자동생성 : ");
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		//6-2.입력번호 출력
		System.out.print("입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.print(myNum[i]+" ");
		}
		System.out.println();
		
		//6-3.당첨번호 출력
		System.out.print("당첨번호 : ");
		for(int i=0;i<count;i++) {
			System.out.print(lottoNum[i]+" ");
		}
		System.out.println();
		
		//6-4.당첨갯수 출력
		System.out.println("당첨 개수 :"+count);
		
	}

}
