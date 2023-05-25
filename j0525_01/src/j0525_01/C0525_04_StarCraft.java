package j0525_01;

public class C0525_04_StarCraft {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Marine m1 = new Marine();
		Tank t2 = new Tank();
		Marine m2 = new Marine();
		Scv s1 = new Scv();
		Vulture v1 = new Vulture();
		
		t1.hitPoint -= 10; //총 2방
		t1.hitPoint -= 10; //
		System.out.println("현재 체력 : "+t1.hitPoint);
		s1.repair(t1);
		System.out.println("수리완료 후 체력 : "+t1.hitPoint);
		System.out.println();
		
		v1.hitPoint -= 10; //총 2방
		v1.hitPoint -= 10; //
		System.out.println("현재 체력 : "+v1.hitPoint);
		s1.repair(v1);
		//System.out.println("수리완료 후 체력 : "+t1.hitPoint);
		
		

	}

}
