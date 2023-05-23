package j0523_01;

public class C0523_05 {

	public static void main(String[] args) {
		// 12시 50분 52초 입력 -> 데이터를 입력해야함
		Time t = new Time(12,50,52);
		//12시 출력 -> 참조변수명.메소드명
		System.out.println(t.getHour()+"시");
		
		//잘못된 데이터를 입력했을 때 -> 입력한 데이터 값으로 리턴
		t.setHour(25);
		System.out.println(t.getHour()+"시");
		//알맞은 데이터를 입력했을 때 -> 
		t.setHour(22);
		System.out.println(t.getHour()+"시");
		
		
		

	}

}
