package j0511_01;

public class C0511_01 {

	public static void main(String[] args) {
		// 구구단 출력 다시 + 가로로 나타내기
		int i;
		int j;
		for(i=1;i<10;i++) {
			System.out.printf("[  %d단  ]\t",i);
		}
		System.out.println();
		for(i=1;i<10;i++){
			for(j=1;j<10;j++){
				System.out.printf("%d * %d = %d\t",j,i,i*j);
			}
			System.out.println();
		}

	}

}
