package j0524_01;

public class C0524_02_Tv {
	
	public static void main(String[] args) {
		
		//객체 선언
		CaptionTv c = new CaptionTv();
		c.channelUp();
		System.out.println(c.channel);
		c.caption();
		
		//다형성
		Tv t = new CaptionTv();
		t.channelUp();
		System.out.println(t.channel);
		//t.caption(); -> 공간은 있지만 t의에 메소드가 없어서 사용 불가
		
		//
		Tv t2 = new Tv();
		t2.channelUp();
		System.out.println(t2.channel);

	}
	

}
