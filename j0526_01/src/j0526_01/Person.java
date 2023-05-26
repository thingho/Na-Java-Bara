package j0526_01;

public class Person {
	
	long id; //주민번호 0000000000000L 13자리
	
	Person(){}
	Person(long id){
		this.id = id;
	}
	
	Person(Person p){
		this.id = p.id;
	}
	
	public boolean equals (Object obj) {
		Person p = (Person)obj;
		boolean check = false;
		if(id==(p.id)) {
			check = true;
		}
		return check;
	}
	
//	public String toString() {
//		String str = "주민번호 : "+id;
//		return str;
//	}

}
