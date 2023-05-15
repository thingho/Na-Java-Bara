package j0515_01;

public class C0515_05 {

	public static void main(String[] args) {
		// 5,4배열 1~20까지 숫자입력후 출력하시오.
		int[][] box = new int[5][4];

		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				box[i][j] = (4*i)+(j+1);  //1~20
				//5번째 열에 1 넣기
				if(i==4) {
					box[i][j] = 1;
				}else { 
					box[i][j] = 0;
				}

			}
		}
		
		//섞기
		
		
		
		//상단번호 출력
		System.out.print("  \t");
		for(int i=0;i<4;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("--------------------------------------");
		
		//box번호 출력
		for(int i=0;i<5;i++) {
			System.out.print(i+"|\t");
			for(int j=0;j<4;j++) {
				System.out.print(box[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");

	}

}
