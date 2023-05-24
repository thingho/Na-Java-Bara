package j0524_01;

public class C0524_01 {

	public static void main(String[] args) {
		//Singleton ss = new Singleton();
		Singleton ss = Singleton.getInstance();
		
		System.out.println(ss.getNum());
		System.out.println(Singleton.getNum());
		

	}

}
