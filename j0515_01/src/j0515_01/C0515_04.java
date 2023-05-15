package j0515_01;

public class C0515_04 {

	public static void main(String[] args) {
		// 2차원 배열
		//가로 4, 세로 3 배열 생성
		int box[][] = new int[4][3];
		
		//번호 입력
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				box[i][j] = (3*i)+(j+1);
			}
		}
		
		//위의 타이틀 0,1,2
		for(int i=0;i<3;i++) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------");
		
		
		//번호 출력
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(box[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------");

	}

}
