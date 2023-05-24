package j0524_01;

public class C0524_03_Car {
	
	public static void main(String[] args) {
		//객체 선언
		Car c = new Car();
		Car cc = null;
		Ambulance a = new Ambulance();
		Ambulance aa = null;
		FireEngine f = new FireEngine();
		FireEngine ff = null;
		
		//다형성
		Car c2 = new Ambulance();
		Car c3 = new FireEngine();
		//---------------------------
		a.siren();
		f.water();
		//c2.siren(); -> 부모에는 siren() 주소가 없음
		//c3.water(); -> 부모에는 water() 주소가 없음
		aa = (Ambulance)c2;
		aa.siren();
		
		// 다른 자손의 형변환은 안됨
		//aa = c3;
		
		//자손의 참조변수로 부모의 객체를 다루는 것은 안됨
		//aa = (Ambulance)c;
		//Ambulance aa = new Car(); -> 다형성이 아니기 때문에 불가능
		//aa.siren();
		
	}
	

}
